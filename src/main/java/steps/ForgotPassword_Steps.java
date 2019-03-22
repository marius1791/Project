package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ForgotPassword_Page;

public class ForgotPassword_Steps extends ScenarioSteps {
    ForgotPassword_Page forgotPassword_page;


    @Step("Test 1: Forgot password page elements")
    public void forgotPassword_elements() {
        forgotPassword_page.forgot_password_page_elements();
    }

    @Step("Test 2: Forgot Password flow")
    public void forgotPassword_flow() {
        forgotPassword_page.forgot_password_flow();
    }
}
