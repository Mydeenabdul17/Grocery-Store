package com.superMarket.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stationary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item;
	private int count;
	private String unit;
	public Stationary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Stationary [id=" + id + ", item=" + item + ", count=" + count + ", unit=" + unit + "]";
	}
	
}
