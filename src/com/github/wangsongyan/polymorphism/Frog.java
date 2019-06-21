package com.github.wangsongyan.polymorphism;

import static com.github.wangsongyan.util.Print.*;

class Characteristic{
	private String s;
	Characteristic(String s){
		this.s = s;
		print("Creating Characteristic " + s);
	}
	protected void dispose() {
		print("diposing Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s){
		this.s = s;
		print("Creating Description " + s);
	}
	protected void dispose() {
		print("disposing Description " + s);
	}
}

class LivingCreature{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Base Living Creature");
	LivingCreature(){
		print("LivingCreature()");
	}
	protected void dispose() {
		print("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal(){ print("Animal()");}
	protected void dispose() {
		print("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian(){ print("Amphibian()");}
	protected void dispose() {
		print("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian{
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	Frog(){ print("Frog()");}
	protected void dispose() {
		print("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		print("Bye!");
		frog.dispose();
	}

}

/*
Creating Characteristic is alive
Creating Description Base Living Creature
LivingCreature()
Creating Characteristic has heart
Creating Description Animal not Vegetable
Animal()
Creating Characteristic can live in water
Creating Description Both water and land
Amphibian()
Creating Characteristic Croaks
Creating Description Eats Bugs
Frog()
Bye!
Frog dispose
disposing Description Eats Bugs
diposing Characteristic Croaks
Amphibian dispose
disposing Description Both water and land
diposing Characteristic can live in water
Animal dispose
disposing Description Animal not Vegetable
diposing Characteristic has heart
LivingCreature dispose
disposing Description Base Living Creature
diposing Characteristic is alive
*/
