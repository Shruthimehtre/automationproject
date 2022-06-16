package mobileworldauntomationAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
 
public class browser{
    WebDriver driver;
    @Test
    public void Lanching_the_Browser() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shruthi.c\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net");
        driver.manage().window().maximize();
 

    }}