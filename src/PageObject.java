import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	public static class InitPage {
	
	public static WebElement caixaSeuNome (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.name("your-name"));
			return element;
		}
	}
	
	public static class HomePage {
		
		public static WebElement signInMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a"));
			return element;
		}
		
		public static WebElement emailBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("user_email"));
			return element;
		}
		
		public static WebElement signInText(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("div.panel-heading > h4"));
			return element;
		}
		
		public static WebElement passwordBox(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("user_password"));
			return element;
		}
		
		public static WebElement signInButton(WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.name("commit"));
			return element;
		}
		
		public static WebElement homeMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul:nth-child(1) > li:nth-child(1) > a"));
			return element;
		}
		
		public static WebElement myTasksMenu (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul:nth-child(1) > li:nth-child(2) > a"));
			return element;
		}
		
		public static WebElement todoText (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("center > h1"));
			return element;
		}
	}
	
	public static class initialPage {
		
		public static WebElement welcomeText (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("ul.nav.navbar-nav.navbar-right > li:nth-child(1) > a"));
			return element;
		}
		
		public static WebElement taskNameBox (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.id("new_task"));
			return element;
		}
		
		public static WebElement addTaskButton (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("form[name=\"task_form\"] span"));
			return element;
		}
		
		public static WebElement firstTaskGrid (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("tr:nth-child(1) > td.task_body.col-md-7 > a"));
			return element;
		}
		
		public static WebElement todoListText (WebDriver driver){
			WebElement element = null;
			element = driver.findElement(By.cssSelector("div.container > h1"));
			return element;
		}
}
}