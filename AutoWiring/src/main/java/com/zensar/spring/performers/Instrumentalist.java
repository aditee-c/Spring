package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
//auto wired can only be used for complex properties
@Component("pyare mohan")
public class Instrumentalist implements Performer {
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	@Value("Dil chahta hai!!!!!")
	private String song;

	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is Playing a song  " + song);
		instrument.play();
	}

}
