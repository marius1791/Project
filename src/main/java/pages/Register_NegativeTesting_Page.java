package pages;

import common.Helper2;
import org.openqa.selenium.By;

public class Register_NegativeTesting_Page extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By register_button() {
        return By.xpath("//a[contains(text(),'Register')]");
    }

    public static By name_field() {
        return By.cssSelector("input[name='name']");
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


    public void blankUsername() {
        clickElement(this.getDriver(),home_subtitle(), 3000);
        clickElement(this.getDriver(), register_button(),3000);
        clickElement(this.getDriver(), register_confirmation_button(), 3000);
//        popUp(this.getDriver(), "Please fill in this field.");
    }
}
