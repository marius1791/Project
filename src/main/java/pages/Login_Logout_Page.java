package pages;

import common.Helper2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Logout_Page extends Helper2 {

    public static By home_subtitle() {
        return By.xpath("//a[contains(text(),'home')]");
    }

    public static By login_element() {
        return By.xpath("//a[contains(text(),'Login')]");
    }

    public static By email_address() {
        return By.cssSelector("input[name='email']");
    }


    }

