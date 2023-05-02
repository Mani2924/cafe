package com.twilight.cafe.model;

import java.security.Timestamp;
import java.util.List;

public class Token {
	private String id;
    private Integer tokenNo;
    private List<OrderItem> orderItems;
    private boolean isCancelled = Boolean.TRUE;
    private Timestamp createdOn;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(Integer tokenNo) {
		this.tokenNo = tokenNo;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public boolean isCancelled() {
		return isCancelled;
	}
	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
}
