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
}

