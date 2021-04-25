package tests;

import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT004FinalizarLeilaoAdmin {
	
	public WebDriver driver;
	Random random = new Random();
	
	//Futura utilização de uma base de dados como um portal de massas ou etc
		String seuusername = "teste123",
			   suasenha = "teste321",
			   objeto3 = "Martelo do Thor";	   
	
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://marinho.brazilsouth.azurecontainer.io/");
			System.out.println("Acessando o site: http://marinho.brazilsouth.azurecontainer.io/");
		}
		
		@Test
		public void testFinalizacaoProposta() throws InterruptedException {
			System.out.println("Acessando a minha conta");
			driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(seuusername);
				System.out.println("Inserindo o nome com: " + seuusername);
			driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(suasenha);
				System.out.println("Inserindo a senha com: " + suasenha);
			driver.findElement(By.xpath("//button[@class='btn float-right login_btn']")).click();
				System.out.println("Acessando ao sistema TOTVS");
			Thread.sleep(1500);
			driver.findElement(By.linkText(objeto3)).click();
				System.out.println("Selecionado o " + objeto3 + " com sucesso");	
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				System.out.println("Botão do fim do Leilão no sistema TOTVS");	
				System.out.println("Proposta realizada no sistema TOTVS realizado com sucesso");
				Thread.sleep(6000);
		}
		
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}
}