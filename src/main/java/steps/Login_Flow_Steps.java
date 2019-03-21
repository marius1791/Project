package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Login_Flow_Page;

public class Login_Flow_Steps extends ScenarioSteps {

    Login_Flow_Page login_flow_page;

    @Step("Test 1: Successful login")
    public void successfulLogin() {
        login_flow_page.valid_credentials_login();
    }

    @Step("Test 2: Invalid email - empty field")
    public void invalid_empty_email() {
        login_flow_page.emptyEmailField();
    }

    @Step("Test 3: Invalid password - empty field")
    public void invalid_empty_password() {
        login_flow_page.emptyPasswordField();
    }

    @Step("Test 4: Invalid email - password - empty field")
    public void invalid_empty_email_password() {
        login_flow_page.emptyEmail_Password();
    }

    @Step("Test 5: Invalid email - password - digits ")
    public void invalid_email_password_digits() {
        UserInfo userInfo = new UserInfo().generateUser();
        login_flow_page.invalid_email_password_digits(userInfo);
    }

    @Step("Test 6: Invalid email - password - specialCharacters ")
    public void invalid_email_password_specialCharacters() {
        UserInfo userInfo = new UserInfo().generateUser();
        login_flow_page.invalid_email_password_specialCharacters(userInfo);
    }
}
