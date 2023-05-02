package com.twilight.cafe.service;

import com.twilight.cafe.entity.Token;
import com.twilight.cafe.response.Response;

public interface OrderItemService {

	Response addItem(Token token);

}
