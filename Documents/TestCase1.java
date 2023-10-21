package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase1 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Vinayavish July 2022\\CDAC June 2023\\CDAC Delhi Jun2023\\sdmdelhi\\Testing-and-Integration\\LAB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Prof. Ajit Vishwakarma");
		
		//driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
				
		//Find no. of anchor tag, button, textarea
		
		List<WebElement> mylist = driver.findElements(By.xpath("//a"));
		
		System.out.println("No. of Links=" +mylist.size());
		
		List<WebElement> mylist_button = driver.findElements(By.xpath("//button"));
		System.out.println("No. of Buttons=" +mylist_button.size());
		
		List<WebElement> mylist_textbox = driver.findElements(By.xpath("//input[@type='text']"));;
		System.out.println("No. of Textbox=" +mylist_textbox.size());
		
		List<WebElement> mylist_textarea = driver.findElements(By.xpath("//textarea"));
		System.out.println("No. of textarea=" +mylist_textarea.size());
		
		List<WebElement> mylist_checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));;
		System.out.println("No. of checkbox=" +mylist_checkbox.size());
		
		driver.get("E:\\Vinayavish July 2022\\CDAC June 2023\\CDAC Delhi Jun2023\\sdmdelhi\\Testing-and-Integration\\LAB\\registration.html");
		
		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int chk = 0;
		int unchk = 0;
		
		for(WebElement el:els)
		{
			if(el.isSelected())
			{
				chk++;
			}
			else
			{
				unchk++;
			}
		}
		
		System.out.println("Total checked items:" +chk);
		System.out.println("Total Unchecked items:" +chk);
		
		Select se = new Select(driver.findElement(By.xpath("//Select[@id='cars']")));
		
		List<WebElement> myselectlist = se.getOptions();
		System.out.println("Total no. of items:" + myselectlist.size());
		
		for(int i=0;i<myselectlist.size();i++)
		{
			String elementText = myselectlist.get(i).getText();
			
			System.out.println(elementText);
		}
		
		
		
		
	}
}
