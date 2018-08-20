package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {
	
	public static final Target BTN_GOOGLE_APPS = Target.the(
			"El botón de aplicaciones de Google").located(By.id("gbwa"));
	public static final Target BTN_TRANSLATOR = Target.the(
			"El botón de Google Traductor").located(By.id("gb51"));	

}
