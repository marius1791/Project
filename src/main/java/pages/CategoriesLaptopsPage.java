package pages;

import common.Helper2;
import org.openqa.selenium.By;

public class CategoriesLaptopsPage extends Helper2 {
    public static By selectLaptops() {
        return By.xpath("//div[@class='list-group']//a[3]");
    }

    public static By laptop1() {
        return By.xpath("//a[@href='prod.html?idp_=8']//img[@class='card-img-top img-fluid']");
    }

    public static By laptop2() {
        return By.xpath("//a[@href='prod.html?idp_=12']//img[@class='card-img-top img-fluid']");
    }

    public static By laptop3() {
        return By.xpath("//a[@href='prod.html?idp_=9']//img[@class='card-img-top img-fluid']");
    }

    public static By laptop4() {
        return By.xpath("//a[@href='prod.html?idp_=13']//img[@class='card-img-top img-fluid']");
    }

    public static By laptop5() {
        return By.xpath("//a[@href='prod.html?idp_=15']//img[@class='card-img-top img-fluid']");
    }

    public static By laptop6() {
        return By.xpath("//a[@href='prod.html?idp_=11']//img[@class='card-img-top img-fluid']");
    }

    public static By nextButton() {
        return By.id("next2");
    }

    public static By previusButton() {
        return By.id("prev2");
    }

    public static By laptop7() {
        return By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]");
    }

    public static By laptop8() {
        return By.xpath("//div[@id='tbodyid']//div[2]//div[1]//a[1]//img[1]");
    }

    public static By laptop9() {
        return By.xpath("//div[@id='tbodyid']//div[3]//div[1]//a[1]//img[1]");
    }

    public static By laptop10() {
        return By.xpath("//div[@id='tbodyid']//div[4]//div[1]//a[1]//img[1]");
    }

    public static By laptop11() {
        return By.xpath("//div[@id='tbodyid']//div[5]//div[1]//a[1]//img[1]");
    }

    public static By laptop12() {
        return By.xpath("//div[@id='tbodyid']//div[6]//div[1]//a[1]//img[1]");
    }

    public void laptopsFlow() {
        laptopsMethod(this.getDriver(), selectLaptops(), 1000, "Laptop is not present", laptop1(), laptop2(),
                laptop3(), laptop4(), laptop5(), laptop6(), nextButton(), previusButton(), laptop7(), laptop8(), laptop9(), laptop10(),
                laptop11(),laptop12());
    }
}
