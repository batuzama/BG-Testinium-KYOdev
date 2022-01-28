package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage() {

        methods = new Methods();
    }

    public void scrollAndSelect() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//a[@title='Emre ve Tahta Oyuncak']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@onclick='addToFavorites(440988);' and @class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@onclick='addToFavorites(579686);' and @class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@onclick='addToFavorites(440872);' and @class='add-to-favorites']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@onclick='addToFavorites(440857);' and @class='add-to-favorites']"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(3);
        String text2 = methods.findElement(By.xpath("//a[@title='Emre ve Tahta Oyuncak']")).getText();
        Assert.assertEquals("Emre ve Tahta Oyuncak",text2);
        methods.waitBySeconds(3);

    }

}