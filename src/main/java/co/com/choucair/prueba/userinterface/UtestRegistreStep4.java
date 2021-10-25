package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistreStep4 extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("let's type a password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("let's type a password")
            .located(By.id("confirmPassword"));

    public static final Target INPUT_CHECKBOX1 = Target.the("let´s clic a checkbox1")
            .located(By.xpath("//input[@name='newsletterOptIn']"));

    public static final Target INPUT_CHECKBOX2 = Target.the("let´s clic a checkbox1")
            .located(By.xpath("//input[@name='termOfUse']"));

    public static final Target INPUT_CHECKBOX3 = Target.the("let´s clic a checkbox1")
            .located(By.xpath("//input[@name='privacySetting']"));

    public static final Target FINISH_BUTTON = Target.the("Click on the button complete setup")
            .located(By.id("laddaBtn"));
}
