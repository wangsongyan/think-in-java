package com.github.wangsongyan.initialization;

public class OverloadingVarargs2 {
	static void f(float i, Character... args){
		System.out.print("first");
	}
	static void f(char c, Character... args){
		System.out.print("second");
	}
	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}

}
