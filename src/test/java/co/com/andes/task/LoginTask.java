/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.task;

import co.com.andes.interactions.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.andes.userinterfaces.offers_loginUI.BTN_OK;

/**
 *
 * @author litio
 */
public class LoginTask implements Task {

    public LoginTask() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(BTN_OK));
        actor.attemptsTo(WaitInteraction.waitFor(3));
    }

    public static Performable loginTask() {
        return Tasks.instrumented(LoginTask.class);
    }
}
