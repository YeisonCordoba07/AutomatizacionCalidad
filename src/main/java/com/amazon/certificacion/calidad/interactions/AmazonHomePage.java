package com.amazon.certificacion.calidad.interactions;

import com.amazon.certificacion.calidad.userinterfaces.UsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.LINK_HOMEPAGE;


public class AmazonHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("celular").into(UsuarioPage.INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_HOMEPAGE));
    }

    public static AmazonHomePage go(){
        return Tasks.instrumented(AmazonHomePage.class);
    }
}
