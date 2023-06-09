package com.bean;

import java.util.List;

public class Customer {
	private List<Object> list;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Customer [list=" + list + "]";
	}
	
	
	
}
