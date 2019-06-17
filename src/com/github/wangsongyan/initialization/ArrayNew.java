package com.github.wangsongyan.initialization;

import static com.github.wangsongyan.util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}

}
