package com.github.wangsongyan.access;

import com.github.wangsongyan.access.dessert.Cookie;

public class ChocolateChip extends Cookie{

	public ChocolateChip(){
		System.out.println("ChocolateChip constructor");
	}
	
	public void chomp(){
		//! bite();
	}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}

}
