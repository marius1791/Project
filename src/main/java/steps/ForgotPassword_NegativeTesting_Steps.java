package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ForgotPassword_NegativeTesting_Page;

public class ForgotPassword_NegativeTesting_Steps extends ScenarioSteps {
    ForgotPassword_NegativeTesting_Page forgotPassword_negativeTesting_page;

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
}
