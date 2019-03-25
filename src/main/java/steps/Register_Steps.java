package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Register_Page;

public class Register_Steps extends ScenarioSteps {

    Register_Page registerPage;

    @Step("Test 1: Register page elements")
    public void registerElements() {
        registerPage.registerElements();
    }
}
