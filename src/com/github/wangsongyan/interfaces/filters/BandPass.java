package com.github.wangsongyan.interfaces.filters;

public class BandPass extends Filter{
	double lowCutoff, hightCutoff;
	public BandPass(double lowCut, double highCut){
		this.lowCutoff = lowCut;
		this.hightCutoff = highCut;
	}
	public Waveform process(Waveform input){ return input;}
}
