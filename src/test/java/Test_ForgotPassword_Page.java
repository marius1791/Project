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
import steps.Forgot_Password_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)


public class Test_ForgotPassword_Page extends PageObject {
    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private Forgot_Password_Steps forgotPassword_steps;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Forgot Password Elements")
    public void Forgot_Password_Elements() {

        forgotPassword_steps.forgotPassword_elements();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Forgot Password Flow")
    public void Forgot_Password_Flow() {

        forgotPassword_steps.forgotPassword_flow();
        waitABit(1000);
        driver.quit();
    }
}
