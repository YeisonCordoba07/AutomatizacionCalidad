package com.amazon.certificacion.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.amazon.certificacion.calidad.interactions.AmazonHomePage;

public class OpenThe implements Task {

    private PageObject page;

    // Constructor que recibe un objeto PageObject al instanciar la tarea
    public OpenThe(PageObject page){
        this.page = page;
    }

    // Método que implementa la acción de abrir el navegador y navegar a la página
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Utiliza Serenity BDD para abrir el navegador en la página indicada
        actor.attemptsTo(Open.browserOn(page));

        // Utiliza la interacción personalizada AmazonHomePage.go() para realizar acciones específicas en la página de inicio de Amazon
        actor.attemptsTo(AmazonHomePage.go());
    }

    // Método estático para obtener una instancia de la tarea OpenThe, configurada con la página indicada
    public static OpenThe Browser(PageObject page){
        return Tasks.instrumented(OpenThe.class, page);
    }
}
