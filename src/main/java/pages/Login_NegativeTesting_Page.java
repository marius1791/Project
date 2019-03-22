package pages;

import common.Helper2;
import common.UserInfo;
import org.openqa.selenium.By;

public class Login_NegativeTesting_Page extends Helper2 {

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

    // Test 1: Empty field for email
    public void emptyEmailField() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickAndSendKeys(this.getDriver(),password_field(),"marius91",3000);
        clickElement(this.getDriver(), login_button(), 3000);
        popUp2(this.getDriver());
    }

    // Test 2: Empty field for password
    public void emptyPasswordField() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickAndSendKeys(this.getDriver(),password_field(),"marius91",3000);
        clickElement(this.getDriver(), login_button(), 3000);
        popUp2(this.getDriver());
    }

    // Test 3: Empty field for email and password
    public void emptyEmail_Password() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickElement(this.getDriver(), login_button(), 3000);
        popUp2(this.getDriver());
    }

    // Test 4: Invalid credentials (digits for email and password)
    public void invalid_email_password_digits(UserInfo userInfo) {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickAndSendKeys(this.getDriver(), email_field(), userInfo.usernameDigits, 2000);
        clickAndSendKeys(this.getDriver(),password_field(),userInfo.passwordDigits,3000);
        clickElement(this.getDriver(), login_button(), 3000);
        popUp2(this.getDriver());
    }

    // Test 5: Invalid credentials (special characters for email and password)
    public void invalid_email_password_specialCharacters(UserInfo userInfo) {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickAndSendKeys(this.getDriver(), email_field(), userInfo.specialCharacters, 2000);
        clickAndSendKeys(this.getDriver(),password_field(),userInfo.specialCharacters,3000);
        clickElement(this.getDriver(), login_button(), 3000);
        popUp2(this.getDriver());
    }
}
