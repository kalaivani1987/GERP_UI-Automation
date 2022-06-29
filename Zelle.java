package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zelle {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://capitalone.invisionapp.com/share/YH9RH7MJATP#/screens/211496299");
	driver.findElement(By.xpath("//a[text()='663301988']")).click();
	driver.findElement(By.xpath("//a[text()='663301989']")).click();
driver.findElement(By.xpath("//a[text()='663301993']")).click();

	}

}
