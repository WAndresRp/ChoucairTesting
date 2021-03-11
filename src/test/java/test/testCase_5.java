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
		assertEquals("Estamos en constante innovación y crecimiento y por eso buscamos nuevos talentos en testing, desde profesionales en formación que puedan aprender y ser promovidos dentro de la compañía como profesionales que nos complementen y nos ayuden a crecer con cada reto a través de las pruebas de software.\n"
				+ "Anímate y haz parte de una compañía extraordinaria, con 20 años en el sector y una filosofía amigable con sus colaboradores y el mundo.\n"
				+ "El hecho de que sea trabajo no tiene que ser aburrido y monótono, ven y rétate con nosotros.\n"
				+ "Beneficios: contratación directa con todas las prestaciones, contrato indefinido,  plan carrera, formación y desarrollo, sistema de KM, entre otros.", prueba.mensajeConvocatoria());
	}
}