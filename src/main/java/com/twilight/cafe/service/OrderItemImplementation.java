package com.twilight.cafe.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilight.cafe.entity.Token;
import com.twilight.cafe.repository.TokenRepository;
import com.twilight.cafe.response.Constants;
import com.twilight.cafe.response.Response;


@Service
public class OrderItemImplementation implements OrderItemService{

	
	@Autowired
	private TokenRepository tokenRepository;
	
	@Override
	public Response addItem(Token token) {
		Response response = new Response();
		response.setStatus(Constants.SUCCESS);
		response.setData(tokenRepository.save(token));
		response.setMessage("token saved sucessfuly");

		return response;

	}



}
