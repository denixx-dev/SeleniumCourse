import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class FirstTest {
    // открыть нужный браузер
    // ввод соответствующего url
    @Test
    public void correctLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("[value='Login']")).click();
        boolean isTitleDisplayed = driver.findElement(By.xpath("(//*[text()='Swag Labs'])[2]")).isDisplayed();
        assertTrue(isTitleDisplayed);

//        driver.close();
        driver.quit();


//        driver.findElement(By.cssSelector("#user-name"));
//        driver.findElement(By.cssSelector("[id='user-name']"));
//        driver.findElement(By.xpath("//*[@id='user-name']"));
    }

}
