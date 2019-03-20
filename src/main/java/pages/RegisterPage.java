package pages;

import common.Helper2;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;

public class RegisterPage extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By register_button() {
        return By.xpath("//a[contains(text(),'Register')]");
    }

    public static By name_text() {
        return By.cssSelector("label[for='name']");
    }

    public static By company_text() {
        return By.cssSelector("label[for='company']");
    }

    public static By email_text() {
        return By.cssSelector("label[for='email']");
    }

    public static By password_text() {
        return By.cssSelector("label[for='email']");
    }

    public static By password_confirm_text() {
        return By.cssSelector("label[for='password-confirm']");
    }

    public static By login_element() {
        return By.xpath("//a[contains(text(),'Login')]");
    }

    public static By name_field() {
        return By.cssSelector("input[name='password']");
    }

    public static By company_field() {
        return By.cssSelector("input[name='company']");
    }

    public static By email_address() {
        return By.cssSelector("input[name='email']");
    }

    public static By password() {
        return By.cssSelector("input[name='password']");
    }

    public static By confirm_password() {
        return By.cssSelector("input[name='password_confirmation']");
    }

    public static By register_confirmation_button() {
        return By.cssSelector(".btn[type='submit");
    }


    // Test 1: Register page elements
    public void registerElements() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickElement(this.getDriver(), register_button(),3000);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(name_text()).isEqualTo("Name");
        softly.assertThat(company_text()).isEqualTo("Company");
        softly.assertThat(email_text()).isEqualTo("E-Mail Address");
        softly.assertThat(password_text()).isEqualTo("Password");
        softly.assertThat(password_confirm_text()).isEqualTo("Confirm Password");
        softly.assertThat(register_confirmation_button()).isEqualTo("Register");
        waitABit(2000);
        verifyAndAssertElement(this.getDriver(), login_element(), "Login element is not displayed");
        verifyAndAssertElement(this.getDriver(), register_button(), "Register element is not displayed");
        verifyAndAssertElement(this.getDriver(), name_field(), "Name field is not displayed");
        verifyAndAssertElement(this.getDriver(), company_field(), "Company field is not displayed");
        verifyAndAssertElement(this.getDriver(), email_address(), "Email field is not displayed");
        verifyAndAssertElement(this.getDriver(), password(), "Password field is not displayed");
        verifyAndAssertElement(this.getDriver(), confirm_password(), "Confirm password field is not displayed");
        verifyAndAssertElement(this.getDriver(), register_confirmation_button(), "Register confirmation button is not displayed");
    }
}
