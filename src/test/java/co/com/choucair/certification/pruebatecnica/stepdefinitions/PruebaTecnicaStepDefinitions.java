package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.PruebaTecnicaData;
import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaTecnicaStepDefinitions {
    @Before
    public void setStrege(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Maria wants to learn with Utest courses$")
    public void mariaWantsToLearnWithUtestCourses() {
        OnStage.theActorCalled("Maria").wasAbleTo(OpeUp.thePage());
    }


    @When("^registration ends$")
    public void registrationEnds(List<PruebaTecnicaData> pruebaTecnicaData)
    throws Exception{
            OnStage.theActorInTheSpotlight().attemptsTo(RegistrationStep1.The(
                    pruebaTecnicaData.get(0).getStrFName(), pruebaTecnicaData.get(0).getStrLName(), pruebaTecnicaData.get(0).getStrEmail(),
                    pruebaTecnicaData.get(0).getStrMonthBri(), pruebaTecnicaData.get(0).getStrDayBri(), pruebaTecnicaData.get(0).getStrYearBri())
            );
            OnStage.theActorInTheSpotlight().attemptsTo(RegistrationStep2.The(
                    pruebaTecnicaData.get(0).getStrCity(),pruebaTecnicaData.get(0).getStrZip(),pruebaTecnicaData.get(0).getStrCounty()
            ));
            OnStage.theActorInTheSpotlight().attemptsTo(RegistrationStep3.The(
                    pruebaTecnicaData.get(0).getStrComputer(),pruebaTecnicaData.get(0).getStrVersion(),
                    pruebaTecnicaData.get(0).getStrLanguage(),pruebaTecnicaData.get(0).getStrMobile(),
                    pruebaTecnicaData.get(0).getStrModel(),pruebaTecnicaData.get(0).getStrOS()
            ));
            OnStage.theActorInTheSpotlight().attemptsTo(RegistrationStep4.The(
                    pruebaTecnicaData.get(0).getStrPassword(),
                    pruebaTecnicaData.get(0).getStrCPassword()
            ));
       }

    @Then("^the user logs in$")
    public void theUserLogsIn(List<PruebaTecnicaData> pruebaTecnicaData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(pruebaTecnicaData.get(0).getStrUser(),pruebaTecnicaData.get(0).getStrPassword())));
    }



}
