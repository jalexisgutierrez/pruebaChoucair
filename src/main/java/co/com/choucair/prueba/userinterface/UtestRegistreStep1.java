package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistreStep1 extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that us the form to login")
            .located(By.xpath("//a[@class = 'unauthenticated-nav-bar__sign-up']"));

    public static final Target INPUT_NAME = Target.the("let's type the name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("let's type the lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("let's type the email")
            .located(By.id("email"));

    public static final Target SELECT_MES = Target.the("let's type a month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DIA = Target.the("let's type a day")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("let's type a day")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_STEP = Target.the("let's type a day")
            .located(By.xpath(" //a[starts-with(@class, 'btn btn-blue')]"));




}
