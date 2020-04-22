import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First
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
	public void preencherFormulario()
	{
		PageObject.InitPage.caixaSeuNome(driver).sendKeys("Douglas");;
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