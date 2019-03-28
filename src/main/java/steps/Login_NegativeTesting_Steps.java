package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Login_NegativeTesting_Page;

public class Login_NegativeTesting_Steps extends ScenarioSteps {

    Login_NegativeTesting_Page login_negativeTesting_page;

    @Step("Test 1: Invalid email - empty field")
    public void invalid_empty_email() {
        login_negativeTesting_page.emptyEmailField();
    }

    @Step("Test 2: Invalid password - empty field")
    public void invalid_empty_password() {
        login_negativeTesting_page.emptyPasswordField();
    }

    @Step("Test 3: Invalid email - password - empty field")
    public void invalid_empty_email_password() {
        login_negativeTesting_page.emptyEmail_Password();
    }

    @Step("Test 4: Invalid email - password - digits ")
    public void invalid_email_password_digits() {
        UserInfo userInfo = new UserInfo().generateUser();
        login_negativeTesting_page.invalid_email_password_digits(userInfo);
    }

    @Step("Test 5: Invalid email - password - specialCharacters ")
    public void invalid_email_password_specialCharacters() {
        UserInfo userInfo = new UserInfo().generateUser();
        login_negativeTesting_page.invalid_email_password_specialCharacters(userInfo);
    }

    @Step("Invalid credentials (invalid email - valid credentials with a space afterwards for email and password)")
    public void invalid_email_password_blankSpace() {
        UserInfo userInfo = new UserInfo().generateUser();
        login_negativeTesting_page.invalid_email_password_blankSpace(userInfo);
    }
}
