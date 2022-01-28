package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

}
