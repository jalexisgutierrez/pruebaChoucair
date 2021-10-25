package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UtestRegistreStep1;
import co.com.choucair.prueba.userinterface.UtestRegistreStep2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Step2 implements Task {

    private String city;
    private String postalCode;
    private String country;


    public Step2(String city, String postalCode, String country) {
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static Step2 onTheStep2(String city, String postalCode, String country){
        return Tasks.instrumented(Step2.class, city, postalCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(city).into(UtestRegistreStep2.INPUT_CITY),
                Enter.theValue(postalCode).into(UtestRegistreStep2.INPUT_POSTAL)
        );
        try{
            Thread.sleep(2000);
            actor.attemptsTo(

                    Click.on(UtestRegistreStep2.SELECT_DIV),
                    Click.on(UtestRegistreStep2.SELECT_COUNTRY.of(country)),
                    // Enter.theValue(country).into(UtestRegistreStep2.SELECT_COUNTRY),
                    Click.on(UtestRegistreStep1.BUTTON_NEXT_STEP)
            );
        }
        catch(InterruptedException ie){
        }


    }

}
