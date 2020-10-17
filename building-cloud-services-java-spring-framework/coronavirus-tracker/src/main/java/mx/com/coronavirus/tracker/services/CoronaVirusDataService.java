package mx.com.coronavirus.tracker.services;

import java.io.StringReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import mx.com.coronaviru.tracker.model.LocationStats;


@Service
public class CoronaVirusDataService {

	
	private static final String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv";
	private List<LocationStats> allStats = new ArrayList<>();
	
	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchVirusData() {
	
		 List<LocationStats> newStats = new ArrayList<>();
		 
		 HttpClient httpClient = HttpClientBuilder.create().build();
		 
		 ResponseHandler<String> responseHandler = new CustomResponseHandler();
		 
		 URI uri = URI.create(VIRUS_DATA_URL);
		 
	     HttpGet getRequest = new HttpGet(uri);
	     getRequest.addHeader("accept", "text/csv");
	     
	     try {
			HttpResponse response = httpClient.execute(getRequest);
			
			String body = responseHandler.handleResponse(response);
			
			//System.out.println(body);
			
			
			StringReader csvBodyReader = new StringReader(body);
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
			for (CSVRecord record : records) {
				LocationStats locationStats = new LocationStats();
			    locationStats.setState(record.get("Province/State"));
			    locationStats.setCountry(record.get("Country/Region"));
			    int latestCases = Integer.parseInt(record.get(record.size() - 1));
			    int prevDayCases = Integer.parseInt(record.get(record.size() - 2));
			    locationStats.setLatestTotalCases(latestCases);
			    locationStats.setDiffFromPrevDay(latestCases - prevDayCases);
			    
			    newStats.add(locationStats);
			    
			}
			
			this.allStats = newStats;
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<LocationStats> getAllStats() {
		return allStats;
	}

	
	
}
