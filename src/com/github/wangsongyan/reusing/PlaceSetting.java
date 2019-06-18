package com.github.wangsongyan.reusing;

import static com.github.wangsongyan.util.Print.print;

class Plate{
	Plate(int i){
		print("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate constrcutor");
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil constrcutor");
	}
}

class Spoon extends Utensil{
	Spoon(int i){
		super(i);
		print("Spoon constrcutor");
	}
}

class Fork extends Utensil{
	Fork(int i){
		super(i);
		print("Fork constrcutor");
	}
}

class Knife extends Utensil{
	Knife(int i){
		super(i);
		print("Knife constrcutor");
	}
}

class Custom{
	Custom(int i) {
		print("Custom constrcutor");
	}
}

public class PlaceSetting extends Custom{
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i){
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		print("PlaceSetting constrcutor");
	}
	public static void main(String[] args) {
		PlaceSetting x = new PlaceSetting(9);
	}

}
