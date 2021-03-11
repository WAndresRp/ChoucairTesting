package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.homePage;

public class testCase_1 {
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
	}

}
