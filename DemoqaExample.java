

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DemoqaExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Victoria\\Documents\\drivers\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     //Scanner console = new Scanner();
     
     
		driver.navigate().to("http://demoqa.com");
		//WebElement w = driver.findElement(By.partialLinkText("Registration"));
	//w.click();
	driver.findElement(By.partialLinkText("Registration")).click();
	
	if(driver.getCurrentUrl().contains("registration")) {
		System.out.println("Hey, we made it");
	}
	driver.findElement(By.id("name_3_firstname")).sendKeys("Victoria");
	driver.findElement(By.id("name_3_lastname")).sendKeys("Rotari");
	Select country = new Select(driver.findElement(By.id("dropdown_7")));
	country.selectByValue("United States");
	Select month = new Select(driver.findElement(By.id("mm_date_8")));
	month.selectByValue("7");
	Select day = new Select(driver.findElement(By.id("dd_date_8")));
	day.selectByValue("21");
	Select year = new Select(driver.findElement(By.id("yy_date_8")));
	year.selectByValue("1988");
	driver.findElement(By.id("phone_9")).sendKeys("4438565485");
	driver.findElement(By.id("username")).sendKeys("victoria777");
	driver.findElement(By.id("email_1")).sendKeys("rotarivictoria@yahoo.com");
	
	
	
	List<WebElement> status = driver.findElements(By.name("radio_4[]"));
	
	for(WebElement w: status) {
		if (w.getAttribute("value").equals("married")){
			w.click();
		}
	}
			List<WebElement> hobby = driver.findElements(By.name("checkbox_5[]"));
			for(WebElement hb: hobby) {
			if (hb.getAttribute("value").equals("Reading")){
			hb.click();
		}
	
	}
			WebElement uploadElement = driver.findElement(By.id("8513161N"));
            uploadElement.sendKeys("C:\\Users\\Victoria\\Documents\\Screenshot\\8513161N.png");
    		driver.findElement(By.id("description")).sendKeys("I Live in Bellevue");
    		driver.findElement(By.id("password_2")).sendKeys("victoria21");
    		driver.findElement(By.id("confirm_password_password_2")).sendKeys("victoria21");
    	

            
            
            
	File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		Files.copy(scrFile, new File ("C:\\Users\\Victoria\\Documents\\Screenshot\\screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	

}
	
