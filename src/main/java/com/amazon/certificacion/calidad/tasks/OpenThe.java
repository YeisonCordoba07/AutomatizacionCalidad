package com.amazon.certificacion.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.amazon.certificacion.calidad.interactions.AmazonHomePage;

public class OpenThe implements Task {

    private PageObject page;
    public OpenThe(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(AmazonHomePage.go());
    }

    public static OpenThe Browser(PageObject page){
        return Tasks.instrumented(OpenThe.class, page);
    }
}
