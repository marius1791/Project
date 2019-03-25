package pages;

import common.Helper2;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Forgot_Password_Page extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By forgotYourPassword() {
        return By.cssSelector("a.btn-link");
    }

    public static By blazeDemoTitile() {
        return By.cssSelector("a.navbar-brand");}

    public static By login_button() {
        return By.xpath("//a[contains(text(),'Login')]");
    }

    public static By register_button() {
        return By.xpath("//a[contains(text(),'Register')]");
    }

    public static By resetPassword_subtitle() {
        return By.cssSelector(".panel-heading");
    }

    public static By email_address_subtitle() {
        return By.xpath("//label[@class='col-md-4 control-label']");
    }

    public static By email_address_field() {
        return By.cssSelector("input[name='email']");
    }

    public static By send_password_reset_link_button() {
        return By.cssSelector("button.btn-primary");
    }

    // Test 1: Forgot password page elements
    public void forgot_password_page_elements() {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        verifyAndAssertElement(this.getDriver(), blazeDemoTitile(), "Blaze Demo Title is not displayed");
        verifyAndAssertElement(this.getDriver(), login_button(), "Login button is not displayed");
        verifyAndAssertElement(this.getDriver(), register_button(), "Register button is not displayed");
        verifyAndAssertElement(this.getDriver(), resetPassword_subtitle(), "Reset password subtitle is not displayed");
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(email_address_subtitle()).isEqualTo("E-Mail Address");
        verifyAndAssertElement(this.getDriver(), email_address_field(), "Email field is not displayed");
        softly.assertThat(email_address_subtitle()).isEqualTo("Send Password Reset Link");
    }

    // Test 2: Forgot Password flow
    public void forgot_password_flow() {
        clickElement(this.getDriver(), home_subtitle(), 3000);
        clickElement(this.getDriver(), forgotYourPassword(), 3000);
        clickAndSendKeys(this.getDriver(), email_address_field(), "marius@gmail.com", 2000);
        clickElement(this.getDriver(),send_password_reset_link_button(), 3000);

    }
}
