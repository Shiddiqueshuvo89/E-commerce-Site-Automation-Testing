import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
	    		  
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//Search URL
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		//Scroll Down Web page Header -> Footer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(2000);
				
		//Scroll Up Web Page Footer -> Header
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
	
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span/input")).click();
		
		//Click on Product Category
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		
		//Search Watch & Click
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		//Choose Brands by CheckBox
		driver.findElement(By.cssSelector("li#p_89\\2f Casio a > span")).click();
		driver.findElement(By.cssSelector("#p_89\\/Timex > span > a > span")).click();
	    Thread.sleep(2000);
		
		//Select a Product
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[1]/span/a/div/img")).click();
		Thread.sleep(2000);
		
		//Add Cart
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		
		//Check Cart
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	    
		//Search Phone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	    driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

		//Click Phone 
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img[1]")).click();
		
	    //Add Cart Again
	    driver.findElement(By.id("add-to-cart-button")).click();
	
		//Click HomePage
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		
		driver.quit();

		
	}

}
