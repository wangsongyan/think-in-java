package com.github.wangsongyan.initialization;

import static com.github.wangsongyan.util.Print.*;

public class Flower {
	int petalCount = 0;
	String s = "initail value";
	
	public Flower(int petals) {
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount=" + petalCount);
	}
	
	public Flower(String ss) {
		print("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}
	
	public Flower(String s, int petals) {
		this(petals);
		//! this(s);
		this.s = s;
		print("String & int args");
	}
	
	public Flower(){
		this("hi", 47);
		print("default constrcutor (no args)");
	}
	
	void printPetalCount(){
		//! this(11);
		print("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}

}
