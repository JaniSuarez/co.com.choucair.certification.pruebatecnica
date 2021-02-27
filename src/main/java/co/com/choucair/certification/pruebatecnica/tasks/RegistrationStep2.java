package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.Step1;
import co.com.choucair.certification.pruebatecnica.userinterface.Step2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class RegistrationStep2 implements Task {
    private String strCity;
    private String strZip;
    private String strCounty;


    public RegistrationStep2(String strCity, String strZip, String strCounty){
        this.strCity=strCity;
        this.strZip=strZip;
        this.strCounty=strCounty;
    }
    public static RegistrationStep2 The(String strCity, String strZip, String strCounty) {
        return Tasks.instrumented(RegistrationStep2.class,strCity,strZip,strCounty);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step1.ENTER_BUTOON_LOCATION),
                Enter.theValue(strCity).into(Step2.INPUT_CITY),
                Enter.theValue(strZip).into(Step2.INPUT_ZIP),
                Click.on(Step2.INPUT_COUNTRY),
                Click.on(Step2.BOTTON_DEVICES));
    }
}
