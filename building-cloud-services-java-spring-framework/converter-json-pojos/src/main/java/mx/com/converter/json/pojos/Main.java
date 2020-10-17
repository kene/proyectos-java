package mx.com.converter.json.pojos;

public class Main {

	public static void main(String[] args) {
		
		try {
//			ClientRestService.fetchWeatherRequestData();
			JsonRequestToJavaPojos.convertJsonRequestToPojos();
		} catch (Exception e) {
			System.err.println(e.getCause());
		}

	}

}
