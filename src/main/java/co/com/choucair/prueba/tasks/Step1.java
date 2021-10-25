package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UtestRegistreStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Step1 implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String month;
    private String day;
    private String year;

    public Step1(String strName, String strLastName, String strEmail, String month, String day, String year) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static Step1 onTheStep1(String strName, String strLastName, String strEmail, String month, String day, String year){
        return Tasks.instrumented(Step1.class, strName, strLastName, strEmail, month, day, year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistreStep1.LOGIN_BUTTON),
                Enter.theValue(strName).into(UtestRegistreStep1.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestRegistreStep1.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestRegistreStep1.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(UtestRegistreStep1.SELECT_MES),
                SelectFromOptions.byVisibleText(day).from(UtestRegistreStep1.SELECT_DIA),
                SelectFromOptions.byVisibleText(year).from(UtestRegistreStep1.SELECT_YEAR),
                Click.on(UtestRegistreStep1.BUTTON_NEXT_STEP)
        );
    }
}
