package com.github.wangsongyan.ch2;

public class Exercise08 {

	static int i = 100;
	
	public static void main(String[]args) {
		for(int i = 0; i < 100; i++){
			System.out.println(Exercise08.i);
			Exercise08 e = new Exercise08();
		}
	}
	
}