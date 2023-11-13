package com.amazon.certificacion.calidad.interactions;

import com.amazon.certificacion.calidad.userinterfaces.UsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.BUTTON_ADDTOCARD;
import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.PRODUCT;


public class AmazonHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("audifonos bluetooth inalambricos").into(UsuarioPage.INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(PRODUCT));
        actor.attemptsTo(Click.on(BUTTON_ADDTOCARD));
    }

    public static AmazonHomePage go(){

        return Tasks.instrumented(AmazonHomePage.class);
    }
}
