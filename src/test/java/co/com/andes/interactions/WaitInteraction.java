/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.interactions;

import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

/**
 *
 * @author litio
 */
public class WaitInteraction implements Interaction {

    private int seconds;

    public WaitInteraction(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(seconds * 1000);
    }

    public static WaitInteraction waitFor(int seconds) {
        return Tasks.instrumented(WaitInteraction.class, seconds);
    }
}
