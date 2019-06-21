package com.github.wangsongyan.polymorphism.music3;

import com.github.wangsongyan.polymorphism.music.Note;
import static com.github.wangsongyan.util.Print.*;

class Instrument{
	void play(Note n){ print("Instrumrnt.play() " + n);}
	String what(){ return "Instrument";}
	void ajust(){ print("Adjusting Instrumrnt");}
}

class Wind extends Instrument{
	void play(Note n){ print("Wind.play() " + n);}
	String what(){ return "Wind";}
	void ajust(){ print("Adjusting Wind");}
}

class Percussion extends Instrument{
	void play(Note n){ print("Percussion.play() " + n);}
	String what(){ return "Percussion";}
	void ajust(){ print("Adjusting Percussion");}
}

class Stringed extends Instrument{
	void play(Note n){ print("Stringed.play() " + n);}
	String what(){ return "Stringed";}
	void ajust(){ print("Adjusting Stringed");}
}

class Brass extends Wind{
	void play(Note n){ print("Brass.play() " + n);}
	void ajust(){ print("Adjusting Brass");}
}

class Woodwind extends Wind{
	void play(Note n){ print("Woodwind.play() " + n);}
	String what(){ return "Woodwind";}
}

public class Music3 {

	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i: e)
			tune(i);
	}
	public static void main(String[]args){
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
