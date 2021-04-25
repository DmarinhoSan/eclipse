package tests;

import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT003CriarProposta {

	public WebDriver driver;
	Random random = new Random();
	
	//Futura utilização de uma base de dados como um portal de massas ou etc
		String seunome = "vishnext",
			   suasenha = "textvish123",
			   objeto1 = "Escudo do Capitão América",
			   objeto2 = "Manopla do Infinito";
				
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://marinho.brazilsouth.azurecontainer.io/");
		System.out.println("Acessando o site: http://marinho.brazilsouth.azurecontainer.io/");
	}
	
	@Test
	public void testProposta() throws InterruptedException {
		System.out.println("Acessando a minha conta");
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(seunome);
			System.out.println("Inserindo o nome com: " + seunome);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(suasenha);
			System.out.println("Inserindo a senha com: " + suasenha);
		driver.findElement(By.xpath("//button[@class='btn float-right login_btn']")).click();
			System.out.println("Acessando ao sistema TOTVS");
		Thread.sleep(1500);
		driver.findElement(By.linkText(objeto2)).click();
			System.out.println("Selecionando o objeto: '"+ objeto2 + "' no Leilão");
		int numero = random.nextInt(1000);
		driver.findElement(By.id("value")).sendKeys("" + numero);
			System.out.println("Valor da proposta do objeto no valor de R$ " + numero + " inserido com sucesso");
		driver.findElement(By.xpath("//button[contains(text(), 'Bid')]")).click();
			System.out.println("Botão de cadastro clicado com sucesso");
			System.out.println("Proposta realizada no sistema TOTVS realizado com sucesso");
		Thread.sleep(6000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}