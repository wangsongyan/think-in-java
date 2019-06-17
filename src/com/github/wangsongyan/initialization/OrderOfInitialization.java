package com.github.wangsongyan.initialization;

import static com.github.wangsongyan.util.Print.print;

class Window{
	Window(int marker){ print("Window(" + marker + ")");}
}

class House{
	Window w1 = new Window(1);
	House() {
		print("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f(){print("f()");}
	Window w3 = new Window(3);
}

public class OrderOfInitialization {

	public static void main(String[] args) {
		House h = new House();
		h.f();
	}

}
