package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new  Methods();

    }
    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"),"batuhan.gengonul@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"),"Bthn9807");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-form-buttons"));
        methods.waitBySeconds(3);
        String text = methods.findElement(By.cssSelector(".menu.top.login")).getText();
        Assert.assertEquals("Merhaba Batuhan Gengönül",text);
        methods.waitBySeconds(5);
    }

}
