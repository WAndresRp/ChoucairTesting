package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.homePage;

public class testCase_5 {
	private WebDriver driver;
	homePage prueba;

	@Before
	public void setUp() throws Exception {
		prueba = new homePage(driver);
		driver = prueba.chromeDriverConnection();
		driver.manage().window().maximize();
		prueba.visit("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		prueba.empleado();
		prueba.convocatoria();
		assertEquals("Estamos en constante innovaci�n y crecimiento y por eso buscamos nuevos talentos en testing, desde profesionales en formaci�n que puedan aprender y ser promovidos dentro de la compa��a como profesionales que nos complementen y nos ayuden a crecer con cada reto a trav�s de las pruebas de software.\n"
				+ "An�mate y haz parte de una compa��a extraordinaria, con 20 a�os en el sector y una filosof�a amigable con sus colaboradores y el mundo.\n"
				+ "El hecho de que sea trabajo no tiene que ser aburrido y mon�tono, ven y r�tate con nosotros.\n"
				+ "Beneficios: contrataci�n directa con todas las prestaciones, contrato indefinido,  plan carrera, formaci�n y desarrollo, sistema de KM, entre otros.", prueba.mensajeConvocatoria());
	}
}