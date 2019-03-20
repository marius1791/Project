package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

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
