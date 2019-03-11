package pages;

import common.Helper2;
import org.openqa.selenium.By;

public class PlaceOrder extends Helper2 {

    public static By selectProduct() {
        return By.xpath("//a[contains(text(),'HTC One M9')]");
    }

    // driver.navigate().back()
    public static By cartButton() {
        return By.xpath("//a[@class='btn btn-success btn-lg']");
    }

    public static By addToCartDeleteButton() {
        return By.xpath("//a[contains(text(),'Delete')]");
    }

    //"Test1 : Test the functionality of the add to cart - delete flow
    public void addToCartDeleteFlow() {
        addToCartDelete(this.getDriver(), 3000, selectProduct(), cartButton(), addToCartDeleteButton());
    }
}
