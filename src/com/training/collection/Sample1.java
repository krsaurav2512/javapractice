package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		// storing the data
		strList.add("Kumar");
		strList.add("Zain");
		strList.add("Nazim");
		strList.add("Afloz");
		
		//retrieving the stored object using for each loop
//		
//		for(String indStr : strList){
//			System.out.println(indStr);
//			
//		}
	   
       //while loop
		Iterator<String> itr = strList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
