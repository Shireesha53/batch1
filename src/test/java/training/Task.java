package training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task {
public WebDriver driver;
	
	@Test
	public void case1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Browsedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation/");
	}
	
	@Test
	public void case2() {
		driver.findElement(By.linkText("Fake Pricing Page")).click();
		driver.findElement(By.linkText("Services")).click();
		
		
	}
 
	@Test
	public void case3() {	
		driver.findElement(By.linkText("About")).click();
	}
	
	@Test
	public void case4() {	
		driver.findElement(By.linkText("Blog")).click();
	}
	
	@Test
	public void case5() {
		driver.findElement(By.linkText("Education")).click();	
	}
	
	@Test
	public void case6() {
		driver.findElement(By.linkText("Education")).click();
		driver.findElement(By.linkText("Free Courses")).click();
	}
	
	
}
