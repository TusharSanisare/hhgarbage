package com.main.dto;

import org.springframework.stereotype.Component;

@Component
public class IdDTO {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id [id=" + id + "]";
	}

	public IdDTO(int id) {
		super();
		this.id = id;
	}

	public IdDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
