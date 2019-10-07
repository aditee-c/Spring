package com.zensar.spring.poems;

public class TwinkelTwinkel implements Poem {
	private static final String LINES[] = { "Twinkel Twinkel Little Star ", "How I Wonder What You Are ",
			" Up Above The World So High ", "Like A Diamond In The Sky!!" };

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for (String string : LINES) {
			System.out.println(string);
		}
	}

}
