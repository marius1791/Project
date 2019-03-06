package pages;

import common.Helper2;
import org.openqa.selenium.By;

public class CategoriesPhonesPage extends Helper2 {

    public static By selectPhones() {
        return By.xpath("//div[@class='list-group']//a[2]");
    }

    public static By phone1() {
        return By.xpath("//a[@href='prod.html?idp_=7']//img[@class='card-img-top img-fluid']");
    }

    public static By phone2() {
        return By.xpath("//a[@href='prod.html?idp_=3']//img[@class='card-img-top img-fluid']");
    }

    public static By phone3() {
        return By.xpath("//a[@href='prod.html?idp_=2']//img[@class='card-img-top img-fluid']");
    }

    public static By phone4() {
        return By.xpath("//a[@href='prod.html?idp_=4']//img[@class='card-img-top img-fluid']");
    }

    public static By phone5() {
        return By.xpath("//a[@href='prod.html?idp_=6']//img[@class='card-img-top img-fluid']");
    }

    public static By phone6() {
        return By.xpath("//a[@href='prod.html?idp_=1']//img[@class='card-img-top img-fluid']");
    }

    public static By phone7() {
        return By.xpath("//a[@href='prod.html?idp_=5']//img[@class='card-img-top img-fluid']");
    }

    public static By nextButton() {
        return By.cssSelector(".page-item:last-child .page-link");
    }

    public static By previusButton() {
        return By.id("prev2");
    }

    public static By phone8() {
        return By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]");
    }

    public static By phone9() {
        return By.xpath("//div[@id='tbodyid']//div[2]//div[1]//a[1]//img[1]");
    }

    public static By phone10() {
        return By.xpath("//div[@id='tbodyid']//div[3]//div[1]//a[1]//img[1]");
    }

    public static By phone11() {
        return By.xpath("//div[@id='tbodyid']//div[4]//div[1]//a[1]//img[1]");
    }

    public static By phone12() {
        return By.xpath("//div[@id='tbodyid']//div[5]//div[1]//a[1]//img[1]");
    }

    // Test 1: The phone subcategory
    public void phonesFlow() {
        phonesMethod(this.getDriver(), selectPhones(),1000, "Element is not displayed",
                phone1(), phone2(),phone3(), phone4(), phone5(), phone6(), phone7(), nextButton(), previusButton(),
                phone8(), phone9(), phone10(),phone11(),phone12());
    }
}
