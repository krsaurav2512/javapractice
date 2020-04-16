package com.training.collection;

import java.util.HashMap;
import java.util.Map;

public class Sample3 {
	
	public static void main(String[] args) {
		
		Map<String,String> myMap = new HashMap<String,String>();
		
		myMap.put("Trainer", "Kumar");
		System.out.println(myMap.get("Trainer"));
	}

}
