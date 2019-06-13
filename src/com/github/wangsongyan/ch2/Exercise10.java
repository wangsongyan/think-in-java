package com.github.wangsongyan.ch2;

public class Exercise10 {

	public static void main(String[]args) {
		if(args.length < 3){
			System.out.println("error args length:" + args.length);
			return;
		}
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);
		System.out.println("args[2]:" + args[2]);
	}
	
}