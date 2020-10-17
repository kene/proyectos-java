package mx.com.weather.stack.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import mx.com.weather.stack.models.Current;
import mx.com.weather.stack.models.Location;
import mx.com.weather.stack.models.WeatherRequest;
import mx.com.weather.stack.services.WeatherStackService;

@Controller
public class WeatherStackController {

	
	@Autowired
	private WeatherStackService weatherStackService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		WeatherRequest weatherRequest = null;
		Location location = null;
		Current current = null;
		
		try {
			weatherRequest = weatherStackService.getCurrentWeather();
			location = weatherRequest.getLocation();
			current = weatherRequest.getCurrent();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("weatherRequest", weatherRequest);
		
		return "home";
	}
	

	
}
