package pages;

import common.Helper2;
import common.UserInfo;
import org.openqa.selenium.By;

public class Forgot_Password_NegativeTesting_Page extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By forgotYourPassword() {
        return By.cssSelector("a.btn-link");
    }

    public static By email_address_field() {
        return By.cssSelector("input[name='email']");
    }

    public static By send_password_reset_link_button() {
        return By.cssSelector("button.btn-primary");
    }

    // Test 1: Invalid email (empty field)
    public void invalidEmail_emptyField() {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        clickElement(this.getDriver(), send_password_reset_link_button(), 2000);
        popUp2(this.getDriver());
    }

    // Test 2: Invalid email (special characters)
    public void invalidEmail_specialCharacters(UserInfo userInfo) {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        clickAndSendKeys(this.getDriver(), email_address_field(), userInfo.specialCharacters, 2000);
        clickElement(this.getDriver(), send_password_reset_link_button(), 2000);
        popUp2(this.getDriver());
    }

    // Test 3: Invalid email (invalid email - without @gmail.com for example)
    public void invalidEmail_invalidCredentials(UserInfo userInfo) {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        clickAndSendKeys(this.getDriver(), email_address_field(), userInfo.username, 2000);
        clickElement(this.getDriver(), send_password_reset_link_button(), 2000);
        popUp2(this.getDriver());
    }

    // Test 4: Invalid email (invalid email - digits)
    public void invalidEmail_digits(UserInfo userInfo) {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        clickAndSendKeys(this.getDriver(), email_address_field(), userInfo.usernameDigits, 2000);
        clickElement(this.getDriver(), send_password_reset_link_button(), 2000);
        popUp2(this.getDriver());
    }
}
