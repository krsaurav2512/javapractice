package com.training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		
		Set<String> setStr = new HashSet<String>();
		setStr.add("Kumar");
		setStr.add("Nazim");
		setStr.add("Zain");
		setStr.add("Afroz");
		setStr.add("Kumar");
		
		TreeSet<String> treeset = new TreeSet<String>(setStr);
		
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
