package voice;

import java.io.FileReader;
import java.util.Locale;

import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.*;

public class RecognizeVoice extends ResultAdapter implements Runnable {
	
	Recognizer recognizer;

	@Override
	public void resultAccepted(ResultEvent re) {
		String palabra;
		try {
            Result res = (Result) (re.getSource());
            ResultToken tokens[] = res.getBestTokens();
            for (int i = 0; i < tokens.length; i++) {
                palabra = tokens[i].getSpokenText();
                if (palabra.equals("uno")) {
                    System.out.println("uno");
                }
            }
		}catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
	}

	@Override
	public void run() {
		try {
			
			recognizer = Central.createRecognizer(new EngineModeDesc(Locale.ROOT));
			recognizer.allocate();
			FileReader gramatica = new FileReader("Words.txt");
            RuleGrammar reglaGramatica = recognizer.loadJSGF(gramatica);
            reglaGramatica.setEnabled(true);
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

}
