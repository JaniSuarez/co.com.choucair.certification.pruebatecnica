package co.com.choucair.certification.pruebatecnica.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step1 {
    public static final Target JOINTTODAY_BOTTON = Target.the("button that shows us the form of registration")
            .located(By.xpath("//div[@calss='unauthenticated-nav-bar__dropdown-menu']//a[@class='unauthenticated-nav-bar__dropdown-menu-sign-up']//[@href='https://www.utest.com/signup/personal']"));
    public static  final Target INPUT_FNAME = Target.the(("First name"))
            .located(By.id("firstName"));
    public static  final Target INPUT_LNAME = Target.the(("last Name"))
            .located(By.id("lastName"));
    public static  final Target INPUT_EMAIL = Target.the(("email"))
            .located(By.id("email"));
    public static  final Target INPUT_MONTHBRI = Target.the(("birth Month"))
            .located(By.id("birthMonth"));
    public static  final Target INPUT_DAYBRI = Target.the(("birth Day"))
            .located(By.id("birthDay"));
    public static  final Target INPUT_YEARBRI = Target.the(("birth Year"))
            .located(By.id("birthYear"));
    public static  final Target ENTER_BUTOON_LOCATION = Target.the(("Next Setp"))
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
