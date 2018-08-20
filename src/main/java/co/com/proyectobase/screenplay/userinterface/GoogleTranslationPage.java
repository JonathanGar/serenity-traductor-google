package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslationPage extends PageObject {
	
	public static final Target BTN_LEFT_LANGUAGES = Target.the(
			"El botón de idioma origen").located(By.id("gt-sl-gms"));
	public static final Target BTN_RIGTH_LANGUAGES = Target.the(
			"El botón de idioma destino").located(By.id("gt-tl-gms"));	
	public static final Target LEFT_LANGUAGE_ENGLISH = Target.the(
			"El idioma inglés de menú origen").located(By.id(":1g"));	
	public static final Target RIGTH_LANGUAGE_SPANISH = Target.the(
			"El idioma ESPAÑOL de menú destino").located(By.id(":3q"));		
	public static final Target INPUT_TEXT_SOURCE = Target.the(
			"El área de texto de origen").located(By.id("source"));	
	public static final Target BTN_TRANSLATE = Target.the(
			"El botón de idioma destino").located(By.id("gt-submit"));	
	public static final Target TXT_TRANSLATION = Target.the(
			"El botón de idioma destino").located(By.xpath("//*[@id=\"result_box\"]/span"));	

}
