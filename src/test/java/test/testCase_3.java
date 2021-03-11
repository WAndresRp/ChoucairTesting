package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.homePage;

public class testCase_3 {
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
	public void test() throws Exception{
		prueba.empleado();
		prueba.choucairTest();
		assertEquals(" Significa estar comprometido con la transformaci�n digital de las industrias y con probar que juntos podemos construir un mundo mejor a trav�s de la tecnolog�a, la sostenibilidad y la innovaci�n, cumpliendo a la vez nuestros prop�sitos personales.", prueba.mensajeChoucair());
	}
}
