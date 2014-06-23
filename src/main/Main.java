package main;

import voice.RecognizeVoice;
import voice.Speaker;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {

	//public static void main(String[] args) {
		//Thread hiloEscucha = new Thread(new RecognizeVoice());
        //hiloEscucha.start();
	//}
	 
	 public static void main(String[] args) {
	  String text = "Baron in 10 seconds. Dragon in 20 seconds";
	  Speaker freeTTS = new Speaker(text);
	  freeTTS.speak();
	 }
}
