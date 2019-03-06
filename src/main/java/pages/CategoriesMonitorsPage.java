package pages;

import common.Helper2;
import org.openqa.selenium.By;

public class CategoriesMonitorsPage extends Helper2 {

    public static By selectMonitors() {
        return By.xpath("//div[@class='list-group']//a[4]");
    }

    public static By previusButton() {
        return By.id("prev2");
    }

    public static By monitor1() {
        return By.xpath("//a[@href='prod.html?idp_=10']//img[@class='card-img-top img-fluid']");
    }

    public static By monitor2() {
        return By.xpath("//a[@href='prod.html?idp_=14']//img[@class='card-img-top img-fluid']");
    }

    public void monitorsFlow() {
     monitorsMethod(this.getDriver(), selectMonitors(), previusButton(), 1000,
             "Monitors are not present", monitor1(), monitor2());
    }
}
