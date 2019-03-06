package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PlaceOrder extends ScenarioSteps {
    pages.PlaceOrder placeAndDeleteOrderPage;

    @Step("Test 1: Test the functionality of the add to cart delete flow")
    public void deleteAddToCartFlow() {
        placeAndDeleteOrderPage.addToCartDeleteFlow();
    }
}
