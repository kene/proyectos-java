package mx.com.coronaviru.tracker.model;

import lombok.Data;

public @Data class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPrevDay;
	private int newCases;
		

}
