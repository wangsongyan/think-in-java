package com.github.wangsongyan.reusing;

import static com.github.wangsongyan.util.Print.*;

class Villain{
	private String name;
	protected void set(String name) {
		this.name = name;
	}
	public Villain(String name){
		this.name = name;
	}
	public String toString(){
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villain{

	private int orcNumber;
	public Orc(String name, int orcNumber){
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "Orc " + orcNumber + ": " + super.toString();
	}
	
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		print(orc);
		orc.change("Bob", 19);
		print(orc);
	}

}
