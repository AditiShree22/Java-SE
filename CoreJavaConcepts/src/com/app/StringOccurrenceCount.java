package com.app;

/**
 * Count the occurrence of a given character in a string
 * @author Me
 * @param string
 * @return integer count
 */
public class StringOccurrenceCount {

	public static void main(String[] args) {
		
		String input = "Java is a beautiful language";
		int count =0;
		
		//Using String
		for(int i=0 ;i<input.length();i++)
		{
			if(input.charAt(i) == 'u')
				count++;
		}
		System.out.println("U occurred " +count+ " times.");
		
		//Using Character array
		char[] arr = new char[input.length()];
		arr = input.toCharArray();
			
		for(int i = 0; i<input.length();i++)
		{
			if(arr[i]=='a')
				count++;
		}
		System.out.println("A occurred " +count+ " times.");
		
	}

}
