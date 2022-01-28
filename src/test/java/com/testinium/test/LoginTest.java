package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.CatalogPage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CatalogPage catalogPage = new CatalogPage();
        loginPage.login();
        productPage.scrollAndSelect();
        catalogPage.returnHome();
        catalogPage.goToPointsCatalog();
        catalogPage.selectText();

    }
}
