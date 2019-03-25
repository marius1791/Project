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
import steps.ForgotPassword_NegativeTesting_Steps;

@Story(Application.SomeFeature.class)
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/main/resources/urls.csv", separator = Constants.CSV_SEPARATOR)

public class Test_Forgot_Password_NegativeTesting extends PageObject{
    @Managed(uniqueSession = true, driver = "Chrome")
    public WebDriver driver;

    @Steps
    private ForgotPassword_NegativeTesting_Steps forgotPassword_negativeTesting_steps;

    private String url;

    @Before
    public void setupBrowser() {

        //open url
        driver.get(url);

        // make sure the window is maximized
        driver.manage().window().maximize();
    }

    @Test
    @Title("Invalid email (empty field)")
    public void Forgot_Password_EmptyField() {

        forgotPassword_negativeTesting_steps.invalid_email_emptyField();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email (special characters)")
    public void Forgot_Password_SpecialCharacters() {

        forgotPassword_negativeTesting_steps.invalid_email_specialCharacters();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email (invalid email - without @gmail.com for example)")
    public void Forgot_Password_InvalidCredentials() {

        forgotPassword_negativeTesting_steps.invalid_email_invalidCredentials();
        waitABit(1000);
        driver.quit();
    }

    @Test
    @Title("Invalid email (invalid email - digits)")
    public void Forgot_Password_Digits() {

        forgotPassword_negativeTesting_steps.invalid_email_digits();
        waitABit(1000);
        driver.quit();
    }
}
