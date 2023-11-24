package com.amazon.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.CARRITO;
import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.TEXTO_EXITO;

public class Validacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTO_EXITO).answeredBy(actor);
        System.out.println("string"+stringTemporal);

        if(stringTemporal.equalsIgnoreCase("Exito al crear el grupo")){
            System.out.println("Exito");
            return true;
        }
        System.out.println("Fracaso");
        return false;
    }
    public static Validacion theHomePage(){
        return new Validacion();
    }
}
