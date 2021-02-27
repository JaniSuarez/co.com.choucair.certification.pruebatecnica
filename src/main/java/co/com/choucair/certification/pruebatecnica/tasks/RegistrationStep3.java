package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.Step2;
import co.com.choucair.certification.pruebatecnica.userinterface.Step3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationStep3 implements Task
{
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private  String strMobile;
    private String  strModel;
    private String strOS;
    public RegistrationStep3 (String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOS, String strPassword, String strCPassword){
        this.strComputer = strComputer;
        this.strVersion=strVersion;
        this.strLanguage=strLanguage;
        this.strMobile=strMobile;
        this.strModel=strModel;
        this.strOS=strOS;
    }
    public static RegistrationStep3 The(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOS){
        return Tasks.instrumented(RegistrationStep3.class,strComputer,strVersion,strLanguage,strMobile,strModel,strOS);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step2.BOTTON_DEVICES),
                Enter.theValue(strComputer).into(Step3.INPUT_COMPUTER),
                Enter.theValue(strVersion).into(Step3.INPUT_VERSION),
                Enter.theValue(strLanguage).into(Step3.INPUT_LANGUAGE),
                Enter.theValue(strMobile).into(Step3.INPUT_MOBILE),
                Enter.theValue(strModel).into(Step3.INPUT_MODEL),
                Enter.theValue(strOS).into(Step3.INPUT_OS),
                Click.on(Step3.BUTTON_LASTSTEP));
    }
}
