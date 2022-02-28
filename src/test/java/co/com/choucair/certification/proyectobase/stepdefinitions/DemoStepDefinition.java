package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoStepDefinition {
    @Before
    public void setuStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^pasoinicial$")
    public void pasoi() {
        OnStage.theActorCalled("actor").wasAbleTo(Abrir.laUrl());
    }


    @When("^pasoejecucion$")
    public void pasos()  {

    }

    @Then("^Verificar$")
    public void verificar() throws Exception {

    }
}
