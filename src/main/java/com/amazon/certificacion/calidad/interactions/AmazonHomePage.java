package com.amazon.certificacion.calidad.interactions;

import com.amazon.certificacion.calidad.userinterfaces.UsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.*;


public class AmazonHomePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Grupo 2023-2").into(UsuarioPage.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue("Descripion grupo").into(UsuarioPage.INPUT_DESCRIPCION));
        actor.attemptsTo(Enter.theValue("200").into(UsuarioPage.INPUT_VALOR_CRITERIO));
        actor.attemptsTo(Click.on(BOTON_GUARDAR));
        //actor.attemptsTo(Click.on(BUTTON_ADDTOCARD));
    }

    public static AmazonHomePage go(){

        return Tasks.instrumented(AmazonHomePage.class);
    }
}
