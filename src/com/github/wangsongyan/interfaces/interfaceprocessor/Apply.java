package com.github.wangsongyan.interfaces.interfaceprocessor;

import static com.github.wangsongyan.util.Print.*;

public class Apply {

	public static void process(Processor p, Object s){
		print("Using Processor " + p.name());
		print(p.process(s));
	}
	
}
