package com.twilight.cafe.controllers;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilight.cafe.entity.Item;
import com.twilight.cafe.model.ItemModel;
import com.twilight.cafe.response.Response;
import com.twilight.cafe.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	  private ModelMapper modelMapper;


	@PostMapping("/addItem")
	public Response addItems(@RequestBody ItemModel itemModel) {
		Item item = modelMapper.map(itemModel, Item.class);
		Response response = itemService.AddItem(item);
		return  response;		
	}
	
	@PutMapping("/getItemById/{id}")
	public Response getItemById(@PathVariable UUID id) {
		Response response = itemService.getItemById(id);
		return  response;	
	}
	
	@RequestMapping(value = "/getAllItems")
	@GetMapping
	public Response getAllItems() {
		Response response = itemService.getAllItems();
	return  response;
	}
	
	@RequestMapping(value = "/UpdateItemById")
	@PostMapping
	public Response UpdateItemById(@PathVariable UUID id,@RequestBody ItemModel itemModel) {
		Item item = modelMapper.map(itemModel, Item.class);
		Response response = itemService.UpdateItemById(id,item);
	return  response;
	}
	
	@RequestMapping(value = "/deleteItem/{id}")
	@PutMapping
	public Response deleteItemById(@PathVariable UUID id) {
		Response response = itemService.deleteItemById(id);
		return response;	
	}

}
