package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.actions.navigate.NavigateActions;
import starter.actions.planajourney.PlanAJourneyActions;

public class PlanAJourneyStepDefinitions {

    @Steps
    NavigateActions navigate;

    @Steps
    PlanAJourneyActions planAJourney;

    private String departureStation;

    @Given("George is at {} Station")
    public void george_is_at(String departureStation) {
        this.departureStation = departureStation;
        navigate.toThePlanAJourneyPage();
    }

    @When("he wants to travel to {} Station")
    public void he_wants_to_travel_to(String destinationStation) {
        planAJourney.from(departureStation)
                    .to(destinationStation)
                    .andPlanTheJourney();
    }

    @Then("the fastest route should be the {}")
    public void he_should_be_presented_the(String expectedFastestRoute) {
    }
}
