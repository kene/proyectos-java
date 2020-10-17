package mx.com.weather.stack.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import mx.com.weather.stack.models.WeatherRequest;


@Service
public class WeatherStackService {

	
	private static String WEATHER_DATA_URL = "http://api.weatherstack.com/";
	//private static String CURRENT = "current";
	private static String ACCESS_KEY = "access_key=4249114b83762832c4881b4213c572ff";
	private static String QUERY = "query=New York";
	
	
	public WeatherRequest getCurrentWeather() throws JsonSyntaxException, JsonIOException, IOException {
		
//		RestTemplate restTemplate = new RestTemplate();
//		String result = restTemplate.getForObject(
//				WEATHER_DATA_URL +
//				RequestWeatherEnum.CURRENT.type + "?" +
//				ACCESS_KEY + "&" +
//				QUERY, String.class);
//		System.out.println(result);
		
		Gson gson = new Gson();
		
		String path = "src/main/resources/weather_request.json";
		
        String content = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);
        System.out.println(content);
		
		// 1. JSON file to Java object
		WeatherRequest object = (WeatherRequest) gson.fromJson(content, WeatherRequest.class);
		
		System.out.println(object);
//		return result;
		
		return object;
   
	}
	
	public void convertJsonRequestToFile(String result) {
		String basePath = new File("src/main/resources/").getAbsolutePath();
	   
	    try {		    	 
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(basePath + "/weather_request.json"));
	    	writer.write(result);
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	
}
