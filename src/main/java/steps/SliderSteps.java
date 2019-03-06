package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SliderPage;

public class SliderSteps extends ScenarioSteps {

    SliderPage sliderPage;

    @Step("Test 1: Slider elements are present")
    public void flowSlider() {
        sliderPage.sliderFlow();
    }
}
