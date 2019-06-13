package com.github.wangsongyan.ch2;

public class Exercise07 {

	public static void main(String[]args){
		
		Incrementable sf = new Incrementable();
		System.out.println(StaticTest.i);
		sf.increament();
		System.out.println(StaticTest.i);
	}
	
}