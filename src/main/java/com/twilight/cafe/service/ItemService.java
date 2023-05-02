package com.twilight.cafe.service;

import java.util.UUID;

import com.twilight.cafe.entity.Item;
import com.twilight.cafe.response.Response;


public interface ItemService {
	
	public Response getItemById(UUID id);
	public Response getAllItems();
	public Response UpdateItemById(UUID id, Item item);
	public Response deleteItemById(UUID id);
	public Response AddItem(Item item);
}
