package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler() {
		System.out.println("No Arg Constructor of Poetic Juggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parameterized Constructor of Poetic Juggler ");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While Reciting a Poem...");
		poem.recite();
	}
	
}
