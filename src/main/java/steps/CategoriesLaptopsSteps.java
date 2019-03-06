package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CategoriesLaptopsPage;

public class CategoriesLaptopsSteps extends ScenarioSteps {
    CategoriesLaptopsPage categoriesPageLaptops;

    @Step("Test 1: Test laptops subcategory")
    public void laptopSubcategoryFlow () {
        categoriesPageLaptops.laptopsFlow();
    }
}
