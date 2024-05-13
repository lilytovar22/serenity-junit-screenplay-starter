/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andes.userinterfaces.Question_UI.EDIT_OFFER_LIST_TXT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

/**
 *
 * @author litio
 */
public class Offer_list implements Question<String> {
    
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(the((EDIT_OFFER_LIST_TXT), isVisible()));
        return Text.of(EDIT_OFFER_LIST_TXT).answeredBy(actor);
    }

    public static Offer_list message() {
        return new Offer_list();
    }
}
