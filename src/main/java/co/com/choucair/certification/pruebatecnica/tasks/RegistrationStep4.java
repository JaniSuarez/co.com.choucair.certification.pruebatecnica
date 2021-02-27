package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.Step4;
import co.com.choucair.certification.pruebatecnica.userinterface.Step3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationStep4 implements Task {
    private String strPassword;
    private String strCPassword;

    public RegistrationStep4(String strPassword, String strCPassword){
        this.strPassword=strPassword;
        this.strCPassword= strCPassword;
    }

    public static RegistrationStep4 The(String strPassword, String strCPassword) {
        return Tasks.instrumented(RegistrationStep4.class,strPassword,strCPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step3.BUTTON_LASTSTEP),
                Enter.theValue(strPassword).into(Step4.INPUT_PASSWORD),
                Enter.theValue(strCPassword).into(Step4.INPUT_CPASSWORD),
                Click.on(Step4.BUTTON_SETUP));

    }
}
