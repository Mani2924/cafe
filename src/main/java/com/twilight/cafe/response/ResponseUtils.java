package com.twilight.cafe.response;



public class ResponseUtils {
	public static Response invalidParamResponse(String message) {
		Response response = new Response();
		response.setStatus(Constants.INVALID_PARMS);
		response.setMessage(message);
		response.setData(null);
		
		return response;
		
	}

}
