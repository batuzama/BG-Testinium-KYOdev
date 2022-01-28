package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

import static com.testinium.driver.BaseTest.driver;

public class CatalogPage  {
    Methods methods;

    public CatalogPage(){
        methods = new Methods();
    }
    public void returnHome(){
        methods.findElement(By.className("logo-icon")).click();
    }
    public void goToPointsCatalog(){
        methods.click(By.xpath("//a[@class='common-sprite'][contains(text(),'Puan Kataloğu')]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
    }
    public void selectText(){
        methods.selectByText(By.xpath("//div[@class='sort']//select[@onchange='location = this.value;']"),"Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[@class='mn-strong common-sprite'][normalize-space()='Tüm Kitaplar']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[normalize-space()='Hobi']"));
        methods.waitBySeconds(3);
    }

}
