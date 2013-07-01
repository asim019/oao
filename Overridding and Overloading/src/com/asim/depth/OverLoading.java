package com.asim.depth;

public class OverLoading {
	public static void main(String[] args){
		
	}
	
	public int method(int a, String b){
		return 0;
	}
	
	/* This method can not be overridden because parameters and order 
	 * is same as above although return type is different 
	 * 
	 * public int method(int a, String b){
	 * 	return 0;
	 * }
	 */
	
	public void method(String b, int a){
		
	}
	
	
}
