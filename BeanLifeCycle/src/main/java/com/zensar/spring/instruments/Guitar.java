package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting Ting Tiding!!!!");
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is tuned");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is clean");
	}

}
