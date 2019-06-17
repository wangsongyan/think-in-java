package com.github.wangsongyan.initialization;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static com.github.wangsongyan.util.Print.*;

public class ArrayClassObj {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		for(int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(500);
		print(Arrays.toString(a));
	}

}
