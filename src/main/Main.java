package main;

import voice.RecognizeVoice;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Main {

	//public static void main(String[] args) {
		//Thread hiloEscucha = new Thread(new RecognizeVoice());
        //hiloEscucha.start();
	//}

	private static final String VOICENAME_kevin = "kevin16";
	 private String text; // string to speech
	 
	 public Main(String text) {
	  this.text = text;
	 }
	 
	 public void speak() {
	  Voice voice;
	  VoiceManager voiceManager = VoiceManager.getInstance();
	  voice = voiceManager.getVoice(VOICENAME_kevin);
	  voice.allocate();
	  voice.speak(text);
	 }
	 
	 public static void main(String[] args) {
	  String text = "Baron in 10 seconds. Dragon in 20 seconds";
	  Main freeTTS = new Main(text);
	  freeTTS.speak();
	 }
}
