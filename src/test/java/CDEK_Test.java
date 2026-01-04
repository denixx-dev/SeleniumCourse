import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class CDEK_Test {
    // открыть нужный браузер
    // ввод соответствующего url
    @Test
    public void correctLogin() throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cdek.ru/ru/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Понятно']/..")).click();
        driver.findElement(By.xpath("//*[text()='Откуда']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Город']")));
        if (driver.findElement(By.cssSelector("[placeholder='Город']")).isDisplayed()){
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("[placeholder='Город']")).sendKeys("Москва");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Москва, Россия']/..")).click();
        }

        driver.findElement(By.xpath("(//button[text()='Санкт-Петербург'])[2]")).click();

//        WebElement gorodElement = driver.findElement(By.cssSelector("[placeholder='Город']"));

//        driver.close();
        driver.quit();


//        driver.findElement(By.cssSelector("#user-name"));
//        driver.findElement(By.cssSelector("[id='user-name']"));
//        driver.findElement(By.xpath("//*[@id='user-name']"));
    }

}

//<div class="cdek-input__label" data-v-81adf786="">Откуда</div>
//
//<input class="cdek-input__input" value="fgdfg" placeholder="Город" autocomplete="off" data-v-81adf786="">
