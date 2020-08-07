package starter.actions.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {
    public void toThePlanAJourneyPage() {
        this.openUrl("https://tfl.gov.uk/plan-a-journey/");
    }
}
