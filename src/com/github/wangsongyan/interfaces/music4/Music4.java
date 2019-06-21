package com.github.wangsongyan.interfaces.music4;

import static com.github.wangsongyan.util.Print.*;

import com.github.wangsongyan.polymorphism.music.Note;

abstract class Instrument{
	private int i;
	public abstract void play(Note n);
	public String what(){return "Instrument";}
	public abstract void ajust();
}

class Wind extends Instrument{
	public void play(Note n) {
		print("Wind.play() " + n);
	}
	public String what(){ return "Wind";}
	public void ajust() {}
}

class Percussion extends Instrument{
	public void play(Note n) {
		print("Percussion.play() " + n);
	}
	public String what(){ return "Percussion";}
	public void ajust() {}
}

class Stringed extends Instrument{
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
	public String what(){ return "Stringed";}
	public void ajust() {}
}

class Brass extends Wind{
	public void play(Note n) {
		print("Brass.play() " + n);
	}
	public void ajust() {}
}

class Woodwind extends Wind{
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String what(){ return "Woodwind";}
}

public class Music4 {

	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] e){
		for(Instrument i: e)
			tune(i);
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}

}
