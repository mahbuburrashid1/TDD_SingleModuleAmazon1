package testPages.amazonHomePageTest;

import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.AmazonHomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends WebTestBase {


    AmazonHomePage amazonHomePage;

    @BeforeMethod
    public void getInit() {
        amazonHomePage = PageFactory.initElements(driver,   AmazonHomePage.class);
    }


    @Test
    public void searchProductUsingValidProductName() throws InterruptedException {
        // Action method
        amazonHomePage.searchProductUsingValidProductName();
        Thread.sleep(2000);
    }




}