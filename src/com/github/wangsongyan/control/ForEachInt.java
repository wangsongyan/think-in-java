package com.github.wangsongyan.control;

import java.awt.font.NumericShaper.Range;

public class ForEachInt {

	public static void main(String[] args) {
		for(int i : range(10))
			System.out.print(i + " ");
		System.out.println();
		for(int i : range(5, 10))
			System.out.print(i + " ");
		System.out.println();
		for(int i : range(5, 20, 3))
			System.out.print(i + " ");
		System.out.println();
	}

	static int[] range(int end){
		return range(0, end, 1);
	}
	
	static int[] range(int start, int end){
		return range(start, end, 1);
	}
	
	static int[] range(int start, int end, int step){
		int[] array = new int[(end - start)/step];
		for(int i = 0;start < end; start += step, i++){
			array[i] = start;
		}
		return array;
	}
}
