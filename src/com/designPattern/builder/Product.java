package com.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private List<String> list = new ArrayList<String>();
	
	public void add(String str) {
		list.add(str);
	}
	
	public void show() {
		for (String s : list) {
			System.out.println(s);
		}
	}
}
