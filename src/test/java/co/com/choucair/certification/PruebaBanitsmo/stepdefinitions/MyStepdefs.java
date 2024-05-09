package co.com.choucair.certification.PruebaBanitsmo.stepdefinitions;

import co.com.choucair.certification.PruebaBanitsmo.questions.CheckThe;
import co.com.choucair.certification.PruebaBanitsmo.tasks.OpenUp;
import co.com.choucair.certification.PruebaBanitsmo.tasks.ProductsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MyStepdefs {

    @Before
    public void scenarioStart(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than Crihstian entry to Banitsmo")
    public void thanCrihstianEntryToBanitsmo() {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());
    }

    @When("entry the url correct")
    public void entryTheUrlCorrect() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductsPage.ThePage());
    }

    @Then("i can view pdf")
    public void iCanViewPdf(String document) {
        OnStage.theActorInTheSpotlight().should(seeThat(CheckThe.document(document)));
    }
}

