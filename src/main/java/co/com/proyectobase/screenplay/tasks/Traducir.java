package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GoogleHomePage;
import co.com.proyectobase.screenplay.userinterface.GoogleTranslationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task {
	
	private String palabra;
	
	public Traducir(String palabra) {
		super();
		this.palabra = palabra;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleHomePage.BTN_GOOGLE_APPS));
		actor.attemptsTo(Click.on(GoogleHomePage.BTN_TRANSLATOR));		
		
		actor.attemptsTo(Click.on(GoogleTranslationPage.BTN_LEFT_LANGUAGES));		
		actor.attemptsTo(Click.on(GoogleTranslationPage.LEFT_LANGUAGE_ENGLISH));		
		actor.attemptsTo(Click.on(GoogleTranslationPage.BTN_RIGTH_LANGUAGES));
		actor.attemptsTo(Click.on(GoogleTranslationPage.RIGTH_LANGUAGE_SPANISH));
		actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslationPage.INPUT_TEXT_SOURCE));
		actor.attemptsTo(Click.on(GoogleTranslationPage.BTN_TRANSLATE));		
	}
	
	public static Traducir deInglesAEspanolLaPalabra(String palabra) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Traducir.class, palabra);
	}
	

}
