package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Register_NegativeTesting_Page;

public class Register_NegativeTesting_Steps extends ScenarioSteps {

    Register_NegativeTesting_Page register_negativeTesting_page;

    @Step("Test 1: Blank Name")
    public void blankName() {
        register_negativeTesting_page.blankName();
    }

    @Step("Test 2: Blank Company")
    public void blankCompany() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.blankCompany(userInfo);
    }

    @Step("Test 3: Blank Email")
    public void blankEmail() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.blankEmail(userInfo);
    }

    @Step("Test 4: Blank password")
    public void blankPassword() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.blankPassword(userInfo);
    }

    @Step("Test 5: Blank Confirm password")
    public void blankConfirmPassword() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.blankConfirmPassword(userInfo);
    }

    @Step("Test 6: Special characters on name field")
    public void specialCharacters_nameField() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.invalid_name_specialCharacters(userInfo);
    }

    @Step("Test 7: Special characters on company field")
    public void specialCharacters_companyField() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.invalid_company_specialCharacters(userInfo);
    }

    @Step("Test 8: Special characters on email field")
    public void specialCharacters_emailField() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_negativeTesting_page.invalid_email_specialCharacters(userInfo);
    }
}
