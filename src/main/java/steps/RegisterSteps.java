package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    @Step("Test 1: Register page elements")
    public void registerElements() {
        registerPage.registerElements();
    }
}
