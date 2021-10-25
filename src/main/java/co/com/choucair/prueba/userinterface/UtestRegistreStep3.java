package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegistreStep3 extends PageObject {

    //Selecciona el computador
    public static final Target SELECT_DIV_COMPUTER = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='osId']/ancestor::div[1]"));

    public static final Target SELECT_COMPUTER = Target.the("let's type a computer")
            .locatedBy("//div[text() = '{0}']");

    //Selecciona la version
    public static final Target SELECT_DIV_VERSION = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='osVersionId']/ancestor::div[1]"));

    public static final Target SELECT_VERSION = Target.the("let's type a version")
            .locatedBy("//div[text() = '{0}']");

    //Selecciona el Languaje
    public static final Target SELECT_DIV_LANGUAJE = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='osLanguageId']/ancestor::div[1]"));

    public static final Target SELECT_LANGUAJE = Target.the("let's type a languaje")
            .locatedBy("//div[text() = '{0}']");

    //Selecciona el MOBILE
    public static final Target SELECT_DIV_MOBILE = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='handsetMakerId']/ancestor::div[1]"));

    public static final Target SELECT_MOBILE = Target.the("let's type a mobile")
            .locatedBy("//div[text() = '{0}']");

    //Selecciona el Modelo
    public static final Target SELECT_DIV_MODEL = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='handsetModelId']/ancestor::div[1]"));

    public static final Target SELECT_MODEL = Target.the("let's type a modelo")
            .locatedBy("//div[text() = '{0}']");

    //Selecciona el sistema operativo
    public static final Target SELECT_DIV_SISTEMA_OPERATIVO = Target.the("let clikc on div")
            .located(By.xpath("//div[@name='handsetOSId']/ancestor::div[1]"));

    public static final Target SELECT_SISTEMA_OPERATIVO = Target.the("let's type a SO")
            .locatedBy("//div[text() = '{0}']");

}
