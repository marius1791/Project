package steps;

import common.UserInfo;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Register_Flow_Page;

public class Register_FLow_Steps extends ScenarioSteps {

    Register_Flow_Page register_flow_page;

    @Step("Test 1: Test register flow")
    public void registerFlow() {
        UserInfo userInfo = new UserInfo().generateUser();
        register_flow_page.register_flow(userInfo);

    }
}
