package pages;

import common.Helper2;
import org.openqa.selenium.By;

import static net.serenitybdd.core.annotations.findby.By.*;

public class SliderPage extends Helper2 {
    public static By sliderElements() {

        return By.xpath("//div[@class='carousel-item active']//img[@class='d-block img-fluid']");

    }

    public static By sliderButton() {
        return xpath("//span[@class='carousel-control-next-icon']");
    }


    // Test 1: Slider elements are present

    public void sliderFlow() {
        clickAndAssert3times(this.getDriver(), sliderButton(), "Element is not displayed",3000);
    }
}
