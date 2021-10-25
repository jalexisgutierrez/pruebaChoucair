package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UtestRegistreStep1;
import co.com.choucair.prueba.userinterface.UtestRegistreStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Step4 implements Task {

    private String password;
    private String confirmPassowrd;

    public Step4(String password, String confirmPassowrd) {
        this.password = password;
        this.confirmPassowrd = confirmPassowrd;
    }

    public static Step4 onTheStep4(String password, String confirmPassowrd) {
        return Tasks.instrumented(Step4.class, password, confirmPassowrd);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(UtestRegistreStep4.INPUT_PASSWORD),
                Enter.theValue(confirmPassowrd).into(UtestRegistreStep4.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegistreStep4.INPUT_CHECKBOX1),
                Click.on(UtestRegistreStep4.INPUT_CHECKBOX2),
                Click.on(UtestRegistreStep4.INPUT_CHECKBOX3),
                Click.on(UtestRegistreStep4.FINISH_BUTTON)
        );
    }
}
