package test_case.codes;

import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperlinks{
 WebDriver driver;
  public CountHyperlinks()
  {
      WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();
  }
  public void endTest()
  {
      System.out.println("End Test: TestCases");
      driver.close();
     driver.quit();
  }
  public void testcase02()
  {
    driver.get("https://in.bookmyshow.com/explorer/home/chennai");
    List<WebElement> hyperlinks=driver.findElements(By.tagName("a"));
    int count=hyperlinks.size();
    System.out.println("Number of hyperlinks on the home page:"+count);
    System.out.println("End Test case:testcase02");
  }
  }