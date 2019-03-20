package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    HomePage sp;

    @Step("Test 1: Home Elements")
    public void homeElements() {
        sp.homeElements();
    }

    @Step("Test 2: Home link functioality")
    public void linkFunctionality() {
        sp.homePageLinkFunctionality();
    }

    @Step("Test 3: Select Home and all the elements from Login are present ")
    public void LoginElements() {
        sp.LoginElements();
    }
}
