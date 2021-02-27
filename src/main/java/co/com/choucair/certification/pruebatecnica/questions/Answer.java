package co.com.choucair.certification.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean>  {
    private String strUser;
    private String strPassword;

    public Answer(String strUser, String strPassword){
        this.strUser=strUser;
        this.strPassword=strPassword;
    }
    public static Answer toThe(String strUser, String strPassword) {
        return new Answer(strUser,strPassword);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
