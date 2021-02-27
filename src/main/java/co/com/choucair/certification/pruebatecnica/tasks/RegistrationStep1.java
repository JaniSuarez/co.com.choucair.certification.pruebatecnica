package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.Step1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrationStep1 implements Task {
    private  String strFName;
    private String strLName;
    private String strEmail;
    private String strMonthBri;
    private String strDayBri;
    private String strYearBri;

    public RegistrationStep1(String strFName, String strLName, String strEmail, String strMonthBri, String strDayBri, String strYearBri)
    {
        this.strFName = strFName;
        this.strLName = strLName;
        this.strEmail =strEmail;
        this.strMonthBri=strMonthBri;
        this.strDayBri=strDayBri;
        this.strYearBri=strYearBri;
    }

    public static RegistrationStep1 The(String strFName, String strLName, String strEmail, String strMonthBri, String strDayBri, String strYearBri) {
            return Tasks.instrumented(RegistrationStep1.class,strFName,strLName,strEmail,strMonthBri,strDayBri,strYearBri);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Step1.JOINTTODAY_BOTTON),
                Enter.theValue(strFName).into(Step1.INPUT_FNAME),
                Enter.theValue(strLName).into(Step1.INPUT_LNAME),
                Enter.theValue(strEmail).into(Step1.INPUT_EMAIL),
                Enter.theValue(strMonthBri).into(Step1.INPUT_MONTHBRI),
                Enter.theValue(strDayBri).into(Step1.INPUT_DAYBRI),
                Enter.theValue(strYearBri).into(Step1.INPUT_YEARBRI),
                Click.on(Step1.ENTER_BUTOON_LOCATION)
                );
    }
}
