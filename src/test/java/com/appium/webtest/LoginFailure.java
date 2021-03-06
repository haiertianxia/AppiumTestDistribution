package com.appium.webtest;

import static org.junit.Assert.assertNotNull;

import com.test.site.UserBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginFailure extends UserBaseTest {


    @Test public void loginTestFailure() throws InterruptedException {
        getDriver().get("https://www.thoughtworks.com");
        WebElement idElement = getDriver().findElement(By.id("mobile-menu-titleee"));
        assertNotNull(idElement);
        //elementHighlight(idElement);
        idElement.click();
        WebElement commentElement =
            getDriver().findElement(By.xpath(".//*[@id='mobile-menu']/li[6]/a"));
        //elementHighlight(commentElement);
        assertNotNull(commentElement);
        commentElement.click();
        Thread.sleep(5000);
        WebElement contact_us =
            getDriver().findElement(By.xpath(".//*[@id='footer-menu']/div/ul/li[9]/a"));
        contact_us.click();

    }

}
