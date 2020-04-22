import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class EncontrarElementos
{
	private WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Douglas\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.taketest.com.br/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void encontrarElementos()
	{
		WebElement menusobre= driver.findElement(By.id("menu-item-19"));
		assertTrue(menusobre.getText().contains("SOBRE"));
		
		WebElement topicosrecentes = driver.findElement(By.id("recent-post-2"));
		assertTrue(topicosrecentes.isDisplayed());
		
		WebElement tagwebdriver = driver.findElement(By.className("tag-link-32"));
		assertTrue(tagwebdriver.getText().equals("Webdriver"));
	}
	
	@Test
	public void atualizarPagina()
	{
		driver.navigate().refresh();
	}
	
	@After
	public void fecharPagina()
	{
		driver.quit();
	}
}