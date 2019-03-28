package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Forgot_Password_NegativeTesting_Page;

public class Forgot_Password_NegativeTesting_Steps extends ScenarioSteps {
    Forgot_Password_NegativeTesting_Page forgotPassword_negativeTesting_page;

    @Step("Test 1: Invalid email (empty field)")
    public void invalid_email_emptyField() {
        forgotPassword_negativeTesting_page.invalidEmail_emptyField();
    }

    @Step("Test 2: Invalid email (special characters)")
    public void invalid_email_specialCharacters() {
        UserInfo userInfo = new UserInfo().generateUser();
        forgotPassword_negativeTesting_page.invalidEmail_specialCharacters(userInfo);
    }

    @Step("Test 3: Invalid email (invalid email - without @gmail.com for example)")
    public void invalid_email_invalidCredentials() {
        UserInfo userInfo = new UserInfo().generateUser();
        forgotPassword_negativeTesting_page.invalidEmail_invalidCredentials(userInfo);
    }

    @Step("Test 4: Invalid email (invalid email - digits)")
    public void invalid_email_digits() {
        UserInfo userInfo = new UserInfo().generateUser();
        forgotPassword_negativeTesting_page.invalidEmail_digits(userInfo);
    }

    @Step("Test 5: Invalid email (invalid email - valid credentials with a space afterwards)")
    public void invalid_email_blankSpace() {
        UserInfo userInfo = new UserInfo().generateUser();
        forgotPassword_negativeTesting_page.invalidEmail_blankSpace(userInfo);
    }
}
