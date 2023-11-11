package com.amazon.certificacion.calidad.interactions;

import com.amazon.certificacion.calidad.userinterfaces.UsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AmazonHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("celular").into(UsuarioPage.INPUT_TEXT).thenHit(Keys.RETURN));
    }

    public static AmazonHomePage go(){
        return Tasks.instrumented(AmazonHomePage.class);
    }
}
