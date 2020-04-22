import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTask
{
	private WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Douglas\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://qa-test.avenuecode.com/");
		driver.getPageSource().contains("ToDo");
		driver.manage().window().maximize();
	}
	
	@Test
	public void navigateForPages()
	{
		//access home page
		PageObject.HomePage.signInMenu(driver).click();
		assertTrue(PageObject.HomePage.signInText(driver).getText().contains("Sign in"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//sign in to app
		PageObject.HomePage.emailBox(driver).sendKeys("douglas.dcm@gmail.com");
		PageObject.HomePage.passwordBox(driver).sendKeys("acode2017");
		PageObject.HomePage.signInButton(driver).click();
		assertTrue(PageObject.initialPage.welcomeText(driver).getText().contains("Welcome"));
		
		//access home page
		PageObject.HomePage.homeMenu(driver).click();
		assertTrue(PageObject.HomePage.todoText(driver).getText().contains("ToDo"));

	}
	
	@Test
	public void createTask()
	{
		String taskName = "testSelenium";
		
		//access home page
		PageObject.HomePage.signInMenu(driver).click();
		assertTrue(PageObject.HomePage.signInText(driver).getText().contains("Sign in"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//sign in to app
		PageObject.HomePage.emailBox(driver).sendKeys("douglas.dcm@gmail.com");
		PageObject.HomePage.passwordBox(driver).sendKeys("acode2017");
		PageObject.HomePage.signInButton(driver).click();
		assertTrue(PageObject.initialPage.welcomeText(driver).getText().contains("Welcome"));
		
		//access task page
		PageObject.HomePage.myTasksMenu(driver).click();
		assertTrue(PageObject.initialPage.todoListText(driver).getText().contains("ToDo"));
		PageObject.initialPage.taskNameBox(driver).sendKeys(taskName);
		PageObject.initialPage.addTaskButton(driver).click();
		assertTrue(PageObject.initialPage.firstTaskGrid(driver).getText().contains(taskName));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		
	@After
	public void fecharPagina()
	{
		driver.quit();
	}
}