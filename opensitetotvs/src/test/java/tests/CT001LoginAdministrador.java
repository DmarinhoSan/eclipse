package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT001LoginAdministrador {
	
	public WebDriver driver;
	
	//Futura utilização de uma base de dados como um portal de massas ou etc
	String seunome = "João Pedro",
		   seuusername = "SenhorPedro",
		   suasenha = "VingadoresAvante",
	 	   seuemail = "joaopedro@hotmail.com",
	 	   cpf = "58457469061";
	 	   
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://marinho.brazilsouth.azurecontainer.io/");
		System.out.println("Acessando o site: http://marinho.brazilsouth.azurecontainer.io/");
	}

	@Test
	public void testLoginAdministrador() throws InterruptedException {
		driver.findElement(By.linkText("Sign Up")).click();
			System.out.println("Acessando Sign Up");
		driver.findElement(By.id("name")).sendKeys(seunome);
			System.out.println("Preenchendo o campo nome com: " + seunome);
		driver.findElement(By.id("username")).sendKeys(seuusername);
			System.out.println("Preenchendo o campo username com: " + seuusername);
		driver.findElement(By.id("password")).sendKeys("NovosMutantes52");
			System.out.println("Preenchendo o campo senha com: " + suasenha);
		driver.findElement(By.id("email")).sendKeys(seuemail);
			System.out.println("Preenchendo o campo e-mail com: " + seuemail);
		driver.findElement(By.id("cpf")).sendKeys(cpf);
			System.out.println("Preenchendo o campo CPF com: " + cpf);
		driver.findElement(By.id("admin")).click();
			System.out.println("Selecionando o Admin");
		driver.findElement(By.xpath("//button[@class='btn float-right login_btn']")).click();
			System.out.println("Botão de Acessar clicado com sucesso");
			System.out.println("Cadastro no sistema TOTVS realizado com sucesso");
		Thread.sleep(6000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}