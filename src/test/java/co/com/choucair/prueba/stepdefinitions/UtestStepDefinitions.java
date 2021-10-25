package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.model.UtestData;
import co.com.choucair.prueba.questions.Answer;
//import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.prueba.tasks.*;
//import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user clicks and to start the registration$")
    public void theUserClicksAndToStartTheRegistration(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage(),
                Step1.onTheStep1(utestData.get(0).getStrName(),
                        utestData.get(0).getStrLastName(),
                        utestData.get(0).getStrEmail(),
                        utestData.get(0).getMonth(),
                        utestData.get(0).getDay(),
                        utestData.get(0).getYear()), Step2.onTheStep2(utestData.get(0).getCity(),
                        utestData.get(0).getPostalCode(),
                        utestData.get(0).getCountry()));
    }


    @When("^Start filling in the data$")
    public void startFillingInTheData(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Step3.onTheStep3(utestData.get(0).getYourComputer(),
                utestData.get(0).getComputerVersion(),
                utestData.get(0).getLanguaje(),
                utestData.get(0).getYourMobile(),
                utestData.get(0).getModelMobile(),
                utestData.get(0).getOperatingSystem()));
    }

    @Then("^The user finishes filling in the data and sends the form$")
    public void Theuserfinishesfillinginthedataandsendstheform(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Step4.onTheStep4(utestData.get(0).getPassword(), utestData.get(0).getConfirmPassowrd()));
    }

}
