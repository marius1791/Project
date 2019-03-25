package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Home_Page;

public class Home_Page_Steps extends ScenarioSteps {

    Home_Page homePage;

    @Step("Test 1: Home Elements")
    public void homeElements() {
        homePage.homeElements();
    }

    @Step("Test 2: Home link functioality")
    public void linkFunctionality() {
        homePage.homePageLinkFunctionality();
    }

    @Step("Test 3: Select Home and all the elements from Login are present ")
    public void LoginElements() {
        homePage.LoginElements();
    }
}
