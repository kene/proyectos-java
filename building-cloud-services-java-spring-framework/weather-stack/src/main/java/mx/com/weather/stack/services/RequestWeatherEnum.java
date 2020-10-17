package mx.com.weather.stack.services;

public enum RequestWeatherEnum {
	CURRENT("current"),
	HISTORICAL("historical"),
	FORECAST("forecast");
	
	public final String type;
	
	private RequestWeatherEnum(String type) {
		this.type = type;
	}
	
	
	
}
