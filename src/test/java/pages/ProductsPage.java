package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends BasePage {

    private final By title = By.xpath("//*[text()='Products']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return driver.findElement(title).isDisplayed();
    }
}
