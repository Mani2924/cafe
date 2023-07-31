package com.twilight.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilight.cafe.entity.Token;
import com.twilight.cafe.response.Response;
import com.twilight.cafe.service.OrderItemService;


@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;

	@PostMapping("AddItem")
	public Response addItem(@RequestBody Token token) {
	
		Response response = orderItemService.addItem(token);
		
		return response;
	}
	
	
	
	
}
