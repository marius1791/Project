package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CategoriesMonitorsPage;

public class CategoriesMonitorsSteps extends ScenarioSteps {
    CategoriesMonitorsPage categoriesMonitorsPage;

    @Step ("Test 1: The monitors subcategory")
    public void monitorsSubcategoryFlows() {
        categoriesMonitorsPage.monitorsFlow();
    }
}
