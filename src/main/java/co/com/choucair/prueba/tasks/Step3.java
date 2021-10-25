package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UtestRegistreStep1;
import co.com.choucair.prueba.userinterface.UtestRegistreStep2;
import co.com.choucair.prueba.userinterface.UtestRegistreStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Step3 implements Task {

    private String yourComputer;
    private String computerVersion;
    private String languaje;
    private String yourMobile;
    private String modelMobile;
    private String operatingSystem;

    public Step3(String yourComputer, String computerVersion, String languaje, String yourMobile, String modelMobile, String operatingSystem) {
        this.yourComputer = yourComputer;
        this.computerVersion = computerVersion;
        this.languaje = languaje;
        this.yourMobile = yourMobile;
        this.modelMobile = modelMobile;
        this.operatingSystem = operatingSystem;
    }

    public static Step3 onTheStep3(String yourComputer, String computerVersion, String languaje, String yourMobile, String modelMobile, String operatingSystem){
        return Tasks.instrumented(Step3.class, yourComputer, computerVersion, languaje, yourMobile, modelMobile, operatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegistreStep3.SELECT_DIV_COMPUTER),
                Click.on(UtestRegistreStep3.SELECT_COMPUTER.of(yourComputer)),
                Click.on(UtestRegistreStep3.SELECT_DIV_VERSION),
                Click.on(UtestRegistreStep3.SELECT_VERSION.of(computerVersion)),
                Click.on(UtestRegistreStep3.SELECT_DIV_LANGUAJE),
                Click.on(UtestRegistreStep3.SELECT_LANGUAJE.of(languaje)),
                Click.on(UtestRegistreStep3.SELECT_DIV_MOBILE),
                Click.on(UtestRegistreStep3.SELECT_MOBILE.of(yourMobile)),
                Click.on(UtestRegistreStep3.SELECT_DIV_MODEL),
                Click.on(UtestRegistreStep3.SELECT_MODEL.of(modelMobile)),
                Click.on(UtestRegistreStep3.SELECT_DIV_SISTEMA_OPERATIVO),
                Click.on(UtestRegistreStep3.SELECT_SISTEMA_OPERATIVO.of(operatingSystem)),
                Click.on(UtestRegistreStep1.BUTTON_NEXT_STEP)
        );
    }
}
