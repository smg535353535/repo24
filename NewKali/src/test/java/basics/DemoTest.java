package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest 
{
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println("Hi");
		//1st pull
	}

}
