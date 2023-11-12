package com.amazon.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.amazon.certificacion.calidad.userinterfaces.UsuarioPage.TEXT_VALIDATION;

public class Validacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXT_VALIDATION).answeredBy(actor);

        if(stringTemporal.contains(" inteligente desbloqueado, 6 GB+256 GB")){
            System.out.println("exito");
            return true;
        }
        System.out.println("fracaso");
        return false;


    }

    public static Validacion theHomePage(){
        return new Validacion();
    }
}
