package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
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
}
