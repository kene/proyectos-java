package com.mobilecloud.video.exceptions;

public class VideoNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VideoNotFoundException(String exception) {
		super(exception);
	}
}
