package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.GoogleTranslationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(GoogleTranslationPage.TXT_TRANSLATION).viewedBy(actor).asString();
	}

}
