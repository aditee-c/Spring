package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Instrument instrument;
	private String song;

	public Instrumentalist() {
		System.out.println("Instrumentalist is created");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is Set");
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is Set");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is Playing a song  " + song);
		instrument.play();
	}

}
