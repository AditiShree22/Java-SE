package com.app;
/**
 * Java method to reverse a String using library methods !
 * @author Me
 * @param str 
 * @return  reverse of String
 */
public class StringReversal {
	
  public static void main(String[] args) {

	  String strLiteral = "Konnichiwa Minna-San";
	  StringBuffer strBuf = new StringBuffer(strLiteral);
	  System.out.println("Using StringBuffer Class :"+strBuf.reverse());
	  StringBuilder strBuil = new StringBuilder(strBuf);
	  System.out.println("Using StringBuilder class :"+strBuil.reverse());
	  
	  int len = strLiteral.length();
	  
	  char[] charArr = new char[len];
	  char [] revArr = new char[len];
	  charArr = strLiteral.toCharArray();
	  
	  
	  for(int i =0; i<len;i++)
	  {
		  revArr[i] = charArr[len-i-1]; 
	  
	  }
	  String revStr = new String(revArr);
	  System.out.println("Without lib methods :"+revStr);
  }
}
