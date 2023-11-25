package com.amazon.certificacion.calidad.tasks;

import com.amazon.certificacion.calidad.interactions.ConfigurarCriteriosPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private PageObject page;

    public OpenThe(PageObject page){
        this.page = page;
    }

    // Mtodo que implementa la acción de abrir el navegador y navegar a la página
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Utiliza Serenity para abrir el navegador en la pagina
        actor.attemptsTo(Open.browserOn(page));

        // Utiliza la interaccion para hacer las acciones en la pagina
        actor.attemptsTo(ConfigurarCriteriosPage.go());
    }

    public static OpenThe Browser(PageObject page){
        return Tasks.instrumented(OpenThe.class, page);
    }
}
