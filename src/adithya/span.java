package adithya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class span {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver Driver=new FirefoxDriver();
		Driver.manage().window().wait(50);
		Driver.get("http://newtours.demoaut.com/");
		Driver.findElement(By.name("userName")).sendKeys("mercury");
		Driver.findElement(By.name("password")).sendKeys("mercury");
		Driver.findElement(By.name("login")).click();
		
		Driver.findElement(By.name("tripType"));
		WebElement Pass =Driver.findElement(By.name("passCount"));
		Select Passenger_sel=new Select(Pass);
		Passenger_sel.selectByVisibleText("2");
		
		WebElement Departing =Driver.findElement(By.name("fromPort"));
		Select DepartingFrom_sel=new Select(Departing);
		DepartingFrom_sel.selectByVisibleText("newyork");
		
		WebElement month =Driver.findElement(By.name("fromMonth"));
		Select on_sel=new Select(month);
		on_sel.selectByVisibleText("New York");
		

		
		
		
	}

}
