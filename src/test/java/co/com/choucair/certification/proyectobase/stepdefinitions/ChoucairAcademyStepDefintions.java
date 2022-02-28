package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ChoucairAcademyStepDefintions {
    @Before
    public  void setState() {
        setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() throws Exception {
        theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the course Recursos Automatización Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform() throws Exception {

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia() throws Exception {

    }
}
