package com.github.wangsongyan.reusing;

import static com.github.wangsongyan.util.Print.*;

class Cleanser {
	private String s = "Cleanser";
	public void append(String a){s += a;}
	public void dilute(){append(" dilute()");}
	public void apply(){append(" apply()");}
	public void scrub(){append(" scrub()");}
	public String toString(){return s;}
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		print(x);
	}
}

public class Detergent extends Cleanser{
	
	public void scrub(){
		append(" Detergent.scrub");
		super.scrub();
	}
	
	public void foam(){ append(" foam()");}
	
	public static void main(String[] args){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
