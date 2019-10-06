import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium {
public static void main(String [] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Админ\\IdeaProjects\\Java\\SeleniumAN\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    WebElement search = driver.findElement(By.className("gLFyf"));
    search.sendKeys("monkey"+ Keys.ENTER);
    WebElement searchWiki = driver.findElement(By.className("ellip"));
    searchWiki.click();
    WebElement searchOrangutan = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
    searchOrangutan.sendKeys("Орангутаны"+ Keys.ENTER);
    }
}
