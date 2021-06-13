package com.learn.collections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap 
{
	public static void main(String[] args)
	{
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("name", "Shankar");
		list.put("id", "14523");
		list.put("city", "cbe");
		list.put("pin", "641062");
		
		for(Map.Entry<String, String> entry : list.entrySet()) 
		{
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
		}
		
		list.forEach((k,v) -> System.out.println("Key : " + k + " value : " + v));
	}
}
