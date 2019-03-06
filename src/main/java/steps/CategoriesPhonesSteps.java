package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CategoriesPhonesPage;

public class CategoriesPhonesSteps extends ScenarioSteps {
    CategoriesPhonesPage categoriesPage;

    @Step("Test 1 : The phone subcategory")
    public void phoneSubcategoryFlow() {
        categoriesPage.phonesFlow();
    }
}
