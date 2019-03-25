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
import steps.Home_Page_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)
public class Home_Page_Test extends PageObject {

    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private Home_Page_Steps step;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Home Elements")
    public void HomeElements() {

        step.homeElements();
        waitABit(1000);
        driver.quit();

    }

    @Test
    @Title("Home link functionality")
    public void HomeLinkFunctionality() {

        step.linkFunctionality();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Login Elements")
    public void loginElements () {

        step.LoginElements();
        waitABit(1000);
        driver.quit();
    }

}

