package com.training.StringExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");
		String str = br.readLine();
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("In reverse order : " + sb.reverse());

	}

}
