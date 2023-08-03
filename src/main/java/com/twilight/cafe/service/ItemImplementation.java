package com.twilight.cafe.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilight.cafe.entity.Item;
import com.twilight.cafe.repository.ItemRepository;
import com.twilight.cafe.response.Constants;
import com.twilight.cafe.response.Response;
import com.twilight.cafe.response.ResponseUtils;

@Service
public  class ItemImplementation implements ItemService{

	@Autowired
	private ItemRepository itemRepository;


	@Override
	public Response AddItem(Item item) {
		Response response = new Response();
		response.setData(itemRepository.save(item));
		response.setMessage("Item Added successfully");
		response.setStatus(Constants.SUCCESS);
		return response;
	}
	
	
	@Override
	public Response getItemById(UUID id) {
		Response response = new Response();
		Optional<Item> itemExists = itemRepository.findById(id);
		if(itemExists.isPresent()) {
			response.setData(itemExists);
			response.setMessage("Item is Available");
			response.setStatus(Constants.SUCCESS);
		}else {
			return ResponseUtils.invalidParamResponse("Please Enter valid id");
		}
		return response;
	}

	@Override
	public Response getAllItems() {
		Response response = new Response();
		List<Item> itemLists = itemRepository.findAll();
		if(!itemLists.isEmpty()) {
			response.setData(itemLists);
			response.setMessage("Item List is available");
			response.setStatus(Constants.SUCCESS);
		}else {
			response.setMessage("Item List is Empty");
			response.setStatus(Constants.SUCCESS);
		}
		return response;	
	}
	
	@Override
	public Response UpdateItemById(UUID id , Item item) {
		Response response = new Response();
		Optional<Item> itemExists = itemRepository.findById(id);
		if(itemExists.isPresent()) {
		}else {
			return ResponseUtils.invalidParamResponse("Please Enter valid id");
		}
		return response;
	}
	
	@Override
	public Response deleteItemById(UUID id) {
		Response response = new Response();
		Optional<Item> itemExists = itemRepository.findById(id);
		if(itemExists.isPresent()) {
			itemExists.get().setStatus(false);
			response.setData(itemExists);
			response.setMessage("Item deleted Successfully");
			response.setStatus(Constants.SUCCESS);	
		}else {
			return ResponseUtils.invalidParamResponse("Please Enter valid id");
		}
		return response;
	}

}
