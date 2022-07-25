package com.amazon.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.amazon.pageElement.AmazonHomePageElements.*;

import static configuration.utilities.DataDriven.getItemsListFromDB;
import static configuration.utilities.DataDriven.getItemsListFromExcel;

public class HomePage2 extends WebTestBase {

    // Modern Approach: @FindBy with How


    // Modern Approach: @FindBy
    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
//    @FindBy(xpath = searchButtonWebElement)
//    public WebElement searchButton;


    public void searchProductUsingValidProductName() {
        searchBox.sendKeys("Hand Sanitizer");
        //  searchButton.click();
    }


    public static List<String> getExpectedProducts() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Shoes");
        itemsList.add("Camera");
        itemsList.add("Bike");
        itemsList.add("Tv");
        return itemsList;
    }

    // Data Driven Approach : Direct data
    public void searchProductUsingValidProductName1() throws InterruptedException {
        for (String st : getExpectedProducts()) {
            searchBox.clear();
            searchBox.sendKeys(st);
//            searchButton.click();
//            String expectedProductName = "\"" + st + "\"";
//            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
            waitFor(5);
        }
    }

    // Data driven approach from Excel
    public void searchProductUsingValidProductName2() throws Exception {
        for (int i = 0; i < getItemsListFromExcel().size()-1; i++) {
            searchBox.clear();
            searchBox.sendKeys(getItemsListFromExcel().get(i + 1));
//            searchButton.click();
//            String expectedProductName = "\"" + getItemsListFromExcel().get(i+1) + "\"";
//            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//            waitFor(5);
        }
    }

    // Data driven approach from Database
    public void searchProductUsingValidProductName3() throws Exception {
        for (String st : getItemsListFromDB()) {
            searchBox.clear();
            searchBox.sendKeys(st);
//            searchButton.click();
//            String expectedProductName = "\"" + st + "\"";
//            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//        }
        }

        // Data driven approach from Data Provider
        //public void searchProductUsingValidProductName4() throws Exception {

//        for (int i = 0; i < getRegistrationDataFromExcel().length; i++) {
//            for (int j = i; j < getRegistrationDataFromExcel()[i].length; j++) {
//                System.out.println(getRegistrationDataFromExcel()[i][j]);
//                searchBox.clear();
//                String firstName= (String) getRegistrationDataFromExcel()[i][j];
//                searchBox.sendKeys(firstName);
//                waitFor(5);
//                searchBox.clear();
//                String lastName= (String) getRegistrationDataFromExcel()[i][j];
//                lastName.sendKeys(lastName);

//                searchButton.click();
//                String expectedProductName = "\"" + st + "\"";
//                String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//                Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//
    }


//        for (Object[] stt:  getRegistrationDataFromExcel()) {
//            for (Object st:stt) {
//                searchBox.clear();
//                searchBox.sendKeys((String) st);
//                searchButton.click();
//                String expectedProductName = "\"" + st + "\"";
//                String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//                Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//
//
//            }
//        }


//        for (String st : getItemsListFromDB()) {
//            searchBox.clear();
//            searchBox.sendKeys(st);
//            searchButton.click();
//            String expectedProductName = "\"" + st + "\"";
//            String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
//            Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");
//        }


}

