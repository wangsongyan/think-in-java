package com.github.wangsongyan.reusing;

import static com.github.wangsongyan.util.Print.*;

class Game{
	Game(int i){
		print("Game constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame{

	Chess() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}

}
