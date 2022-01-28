package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods = new Methods();
        }

        public void home(){

            Assert.assertTrue(methods.isElementVisible(By.cssSelector(".logo-text")));
            methods.waitBySeconds(5);
    }
}
