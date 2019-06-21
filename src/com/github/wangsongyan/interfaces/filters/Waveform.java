package com.github.wangsongyan.interfaces.filters;

public class Waveform {
	private static long coutner;
	private final long id = coutner++;
	public String toString(){ return "Wavform " + id;}
}
