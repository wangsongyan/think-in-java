package com.github.wangsongyan.ch2;

public class Exercise06 {

	public static void main(String[]args) {
		String s = "hello world.";
		System.out.println(new Exercise06().storage(s));
	}
	
	public int storage(String s){
		return s.length() * 2;
	}
	
}