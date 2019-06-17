package com.github.wangsongyan.initialization;

import static com.github.wangsongyan.util.Print.*;

public class InitialValues {

	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	
	void printInitailValues(){
		print("Data type			Initail value");
		print("boolean				" + t);
		print("char					[" + c + "]");
		print("byte					" + b);
		print("short				" + s);
		print("int					" + s);
		print("long					" + l);
		print("float				" + f);
		print("double				" + d);
		print("reference			" + reference);
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitailValues();
	}

}
