import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDevTest {
    @Test
    public void aboutAndLanguage(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.findElement(By.cssSelector("#navbarDropdown")).click();


    }
}
