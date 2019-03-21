import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.Application;
import common.Constants;
import pages.Register_NegativeTesting_Page;
import steps.HomePageSteps;
import steps.Register_NegativeTesting_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)


public class Test_Register_NegativeTesting extends PageObject {
    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private Register_NegativeTesting_Steps step;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Blank Name")
    public void HomeElements() {

        step.blankUsername();
        waitABit(1000);
        driver.quit();

    }
}
