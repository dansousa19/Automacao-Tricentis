package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosdeTestes extends DriversFactory {

	public void AbrirNavegador() {

		String site = "http://sampleapp.tricentis.com/101/index.php";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void clicarPorTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//" + atributo + "[text()='" + texto + "']")).click();

	}

	public void clicarContemTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//" + atributo + "[contains(text(), ='" + texto + "']")).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	
	public void fecharNavegador() {
		driver.quit();
		
	}

}
