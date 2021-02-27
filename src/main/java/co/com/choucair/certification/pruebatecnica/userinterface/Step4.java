package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step4 {
    public static final Target INPUT_PASSWORD= Target.the("Password")
            .located(By.id("password"));
    public static final Target INPUT_CPASSWORD= Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target BUTTON_SETUP= Target.the("full record")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
