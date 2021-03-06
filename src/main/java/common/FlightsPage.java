package common;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsPage extends PageObject {
    /*
        SELECTORS
     */
    private static final String FLIGHT_NUMBERS = ".table tbody tr td:nth-of-type(2)";

    /*
        ACTIONS
     */
    public List<String> getFlights(){
        return findAll(By.cssSelector(FLIGHT_NUMBERS)).stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}

