package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistreStep2 extends PageObject {

    public static final Target INPUT_CITY = Target.the("let's type a city")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL = Target.the("let's type a postal code")
            .located(By.id("zip"));

    //Selecciona el div principal del pais
    public static final Target SELECT_DIV = Target.the("let clikc on div")
            .located(By.xpath("//div[@class='ui-select']"));

    public static final Target SELECT_COUNTRY = Target.the("let's type a country")
            .locatedBy("//div[text() = '{0}']");


}
