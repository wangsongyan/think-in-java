package com.github.wangsongyan.reusing;

import static com.github.wangsongyan.util.Print.*;

class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		print("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s){
		print(s);
		return 47;
	}
}

public class Beetle extends Insect{
	private int k = printInit("Beetle.k inistialized");
	public Beetle(){
		print("k = " + k);
		print("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 inistialized");
	
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
	}

}

/*
static Insect.x1 initialized
static Beetle.x2 inistialized
Beetle constructor
i = 9, j = 0
Beetle.k inistialized
k = 47
j = 39
*/
