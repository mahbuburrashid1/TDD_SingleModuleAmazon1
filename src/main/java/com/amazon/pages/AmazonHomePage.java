package com.amazon.pages;


import configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.amazon.pageElement.AmazonHomePageElements.*;


public class AmazonHomePage extends WebTestBase {


    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;

    public void searchProductUsingValidProductName() throws InterruptedException {
        //WebElement demo= driver.findElement(By.xpath(searchBoxWebElement));
        searchBox.sendKeys("Hand Sanitizer");



    }
}