package co.com.proyectobase.screenplay.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleStepsDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor usuario = Actor.named("user");
	
	@Before
	public void initialConfiguration() {
		usuario.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que el usuario quiere traducir en el traductor de Google$")
	public void queElUsuarioQuiereTraducirEnElTraductorDeGoogle() throws Exception {	
		usuario.wasAbleTo(Abrir.laPaginaDeGoogle());
	}

	@Cuando("^él traduce la palabra (.*) de inglés a español$")
	public void élTraduceLaPalabraTableDeInglésAEspañol(String palabra) throws Exception {
		usuario.attemptsTo(Traducir.deInglesAEspanolLaPalabra(palabra));
	}

	@Entonces("^él debería ver la palabra (.*) en pantalla$")
	public void élDeberíaVerLaPalabraMesaEnPantalla(String palabraEsperada) throws Exception {
		usuario.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
	}
}
