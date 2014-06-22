package main;

import voice.ReconiceVoice;

public class Main {

	public static void main(String[] args) {
		Thread hiloEscucha = new Thread(new ReconiceVoice());
        hiloEscucha.start();
	}

}
