package day3;

public class knockknock {
public static void main(String[] args) {
	speak("knock knock");
}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
