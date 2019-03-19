package common;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;


public class Helper2 extends PageObject {

    public void clickElement(WebDriver ldriver, By element, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
    }

    public void sendKeys(WebDriver ldriver, By element, String message, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
    }

    public void clickAndSendKeys(WebDriver ldriver, By element, String message, int time) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysAndSelectButton(WebDriver ldriver, By element, String message, By element2, String message2, int time, By signUpButton) {
        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element2)).click().build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(element2)).sendKeys(message2).build().perform();
        waitABit(time);
        act.moveToElement(ldriver.findElement(signUpButton)).click().build().perform();
        waitABit(time);
    }

    public void clickAndSendKeysPasswordOrUsername(WebDriver webDriver, By element, String message, int time, By signUpButton) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).sendKeys(message).build().perform();
        waitABit(time);
        act.moveToElement(webDriver.findElement(signUpButton)).click().build().perform();
        waitABit(time);
    }

    public void selectAndAssertTrue(WebDriver webDriver, By element, int time, By element2, String message) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        element(element2).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(message, find(element2).isDisplayed());

    }

    public void verifyAndAssertElement(WebDriver webDriver, By element, String message) {
        Actions act = new Actions(webDriver);
        element(element).withTimeoutOf(15, TimeUnit.SECONDS).waitUntilVisible();
        Assert.assertTrue(message, find(element).isDisplayed());
    }

    public void clickAndAssert3times(WebDriver webDriver, By element, String message, int time) {
        Actions act = new Actions(webDriver);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        Assert.assertTrue(message, find(element).isDisplayed());
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        Assert.assertTrue(message, find(element).isDisplayed());
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        Assert.assertTrue(message, find(element).isDisplayed());
        waitABit(time);
    }

    public void addToCartDelete(WebDriver webDriver, int time, By element, By element2, By element3) {
        Actions act = new Actions(webDriver);
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        act.moveToElement(webDriver.findElement(element2)).click().build().perform();
        waitABit(time);
//        webDriver.navigate().back();
//        webDriver.navigate().back();
//        act.moveToElement(webDriver.findElement(element3)).click().build().perform();
    }

    public void phonesMethod(WebDriver webDriver, By element, int time, String message, By element2, By element3,
                             By element4, By element5, By element6, By element7, By element8, By element9,
                             By previous, By element10, By element11, By element12, By element13, By element14) {
        Actions act = new Actions(webDriver);
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        Assert.assertTrue(message, find(element2).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element3).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element4).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element5).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element6).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element7).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element8).isDisplayed());
        waitABit(time);
        ((JavascriptExecutor) webDriver).executeScript("scroll(0, -250);");
        waitABit(time);
        act.moveToElement(webDriver.findElement(element9)).click().build().perform();
        waitABit(time);
        Assert.assertTrue(message, find(previous).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element10).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element11).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element12).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element13).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element14).isDisplayed());
        waitABit(time);
    }

    public void laptopsMethod(WebDriver webDriver, By element, int time, String message, By element2, By element3,
                              By element4, By element5, By element6, By element7, By element8, By previous, By element9,
                              By element10, By element11, By element12, By element13, By element14) {

        Actions act = new Actions(webDriver);
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        Assert.assertTrue(message, find(element2).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element3).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element4).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element5).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element6).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element7).isDisplayed());
        waitABit(time);
        ((JavascriptExecutor) webDriver).executeScript("scroll(0, -250);");
        waitABit(time);
        act.moveToElement(webDriver.findElement(element8)).click().build().perform();
        waitABit(time);
        Assert.assertTrue(message, find(previous).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element9).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element10).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element11).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element12).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element13).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element14).isDisplayed());
        waitABit(time);
    }

    public void monitorsMethod(WebDriver webDriver, By element, By previous, int time, String message,
                               By element2, By element3) {
        Actions act = new Actions(webDriver);
        waitABit(time);
        act.moveToElement(webDriver.findElement(element)).click().build().perform();
        waitABit(time);
        Assert.assertTrue(message, find(previous).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element2).isDisplayed());
        waitABit(time);
        Assert.assertTrue(message, find(element3).isDisplayed());
        waitABit(time);
    }
}