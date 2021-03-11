package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.project.pom.Base;

public class homePage extends Base {
	By empleadoLocator = By.linkText("Empleos");
	By queEs = By.linkText("¿Qué es ser Choucair?");
	By mensajeChoucair = By.tagName("div");
	By convocatorias = By.linkText("Convocatorias");
	By mensajeConvocatorias = By.tagName("div");
	By tituloDisponibles = By.tagName("div");
	By ciudad = By.name("search_location");
	By btnBuscar = By.xpath("//input[@type=\"submit\"]");
	By prepararseLocator = By.linkText("Prepararse para aplicar");
	
	By mensajePrepararse = By.tagName("div");

	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void empleado() {
		click(empleadoLocator);
	}

	public void choucairTest() {
		if (isDisplayed(queEs)) {
			click(queEs);
		} else {
			System.out.println("Seccion no encontrada");
		}
	}

	public String mensajeChoucair() {
		List<WebElement> p = findElements(mensajeChoucair);
		return getText(p.get(68));
	}

	public void convocatoria() {
		if (isDisplayed(convocatorias)) {
			click(convocatorias);
		} else {
			System.out.println("Seccion no encontrada");
		}
	}

	public String mensajeConvocatoria() {
		List<WebElement> p = findElements(mensajeConvocatorias);
		return getText(p.get(89));
	}

	public void disponible() {

		type("Bogota", ciudad);
		click(btnBuscar);

	}
	
	public void prepararse() {
		if (isDisplayed(prepararseLocator)) {
			click(prepararseLocator);
		} else {
			System.out.println("Seccion no encontrada");
		}
	}
	
	public String mensajePrepararse() {
		
		List<WebElement> p = findElements(mensajePrepararse);
		return getText(p.get(148));
		
		
	}
}