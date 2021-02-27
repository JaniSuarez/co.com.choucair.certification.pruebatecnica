package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step2 {
    public static final Target INPUT_CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Zip")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Country")
            .located(By.xpath("//*[@id=\'regs_container\']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTTON_DEVICES = Target.the("\"Next Setp\"")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
