package starter.actions.planajourney;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class PlanAJourneyActions extends UIInteractionSteps {

    private static final String PROPOSED_STOP = "//span[@class='stop-name'][contains(.,'%s')]";

    public PlanAJourneyActions from(String departureStation) {
        String proposedDepartureStation = String.format(PROPOSED_STOP, departureStation);

        $("#InputFrom").sendKeys(departureStation);
        waitForPresenceOf(proposedDepartureStation);
        $(proposedDepartureStation).click();

        return this;
    }

    public PlanAJourneyActions to(String destinationStation) {
        // Enter the destination station
        return this;
    }

    public PlanAJourneyActions andPlanTheJourney() {
        // click on plan the journey
        return this;
    }
}
