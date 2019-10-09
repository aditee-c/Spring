package com.zensar.spring.performers;
import java.util.Map;



import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	
	private Map<Instrument,String> instrumentSongMap;
	
	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrummentalist is playing ");
		
		for(Map.Entry<Instrument,String> entry : instrumentSongMap.entrySet()) {
			entry.getKey().play();
			System.out.println( " Song is "+entry.getValue());
			
		}
	}
		

}
