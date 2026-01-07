package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        boolean isPageOpened = productsPage.isPageOpened();
        assertTrue(isPageOpened);
    }

    @Test
    public void incorrectLogin() {
        loginPage.openPage();
        loginPage.login("locked_out_user", "secret_sauce");
        String errorText = loginPage.checkErrorMessage();
        assertEquals(errorText, "Epic sadface: Sorry, this user has been locked out.");
    }
}
