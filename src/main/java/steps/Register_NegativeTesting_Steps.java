package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Register_NegativeTesting_Page;

public class Register_NegativeTesting_Steps extends ScenarioSteps {

    Register_NegativeTesting_Page register_negativeTesting_page;

    @Step("Test 1: Blank Username")
    public void blankUsername() {
        register_negativeTesting_page.blankUsername();
    }
}
