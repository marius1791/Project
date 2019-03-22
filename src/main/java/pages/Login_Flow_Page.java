package pages;

import common.Helper2;
import common.UserInfo;
import org.openqa.selenium.By;

public class Login_Flow_Page extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By login_element() {
        return By.xpath("//a[contains(text(),'Login')]");
    }

    public static By register_element() {
        return By.xpath("//a[contains(text(),'Register')]");
    }

    public static By email_field() {
        return By.cssSelector("input[name='email']");
    }

    public static By password_field() {
        return By.cssSelector("input[name='password']");
    }

    public static By login_button() {
        return By.cssSelector(".btn[type='submit");
    }

    public static By forgot_your_password() {
        return By.xpath("//a[@class='btn btn-link']");
    }

    // Test1 : Successful login
    public void valid_credentials_login() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickAndSendKeys(this.getDriver(), email_field(), "marius@mailfavorite.com", 2000);
        clickAndSendKeys(this.getDriver(), password_field(), "marius91", 2000);
        clickElement(this.getDriver(), login_button(), 2000);
    }
}



