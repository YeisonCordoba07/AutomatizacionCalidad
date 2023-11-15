package com.amazon.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.CARRITO;

public class Validacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(CARRITO).answeredBy(actor);

        if(stringTemporal.equalsIgnoreCase("1")){
            System.out.println("exito 1");
            return true;
        }
        System.out.println("fracaso");
        return false;
    }
    public static Validacion theHomePage(){
        return new Validacion();
    }
}
