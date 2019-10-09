package com.zensar.spring.performers;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
		private String song;
		private Set<Instrument> instruments;
	public Instrumentalist() {
		System.out.println("Instrumentalist is created");
	}
	
	
	public Set<Instrument> getInstruments() {
		return instruments;
	}


	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
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
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

}
