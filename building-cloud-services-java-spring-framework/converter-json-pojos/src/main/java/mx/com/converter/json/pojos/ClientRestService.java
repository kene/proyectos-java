package mx.com.converter.json.pojos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;



public class ClientRestService {

	
	private static final String WEATHER_CURRENT_DATA_URL = "http://api.weatherstack.com/current?%20access_key=4249114b83762832c4881b4213c572ff&query=New%20York";
	
	
	public static void fetchWeatherRequestData() throws UnsupportedEncodingException {
	
		 
		 HttpClient httpClient = HttpClientBuilder.create().build();
		 
		 ResponseHandler<String> responseHandler = new CustomResponseHandler();
		 
		 URI uri = URI.create(WEATHER_CURRENT_DATA_URL);
		 
	     HttpGet getRequest = new HttpGet(uri);
	     getRequest.addHeader("accept", "application/json");
	     
	     try {
			HttpResponse response = httpClient.execute(getRequest);
			
			String body = responseHandler.handleResponse(response);
			 System.out.println(body);
			
			 // save json response to file 
			 convertJsonRequestToFile(body);
			 
			 // convert json file to pojos 
			 JsonRequestToJavaPojos.convertJsonRequestToPojos();
			
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
	}
	
	
	public static void convertJsonRequestToFile(String result) {
		String basePath = new File("src/main/java").getAbsolutePath();
	   
	    try {		    	 
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(basePath + "/weather_request.json"));
	    	writer.write(result);
		    writer.close();
		} catch (IOException e) {
			System.err.println(e.getCause());
		} 
	}

	
	
}
