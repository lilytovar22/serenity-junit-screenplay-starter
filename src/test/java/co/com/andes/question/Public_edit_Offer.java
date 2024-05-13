/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andes.userinterfaces.Question_UI.PUBLIC_EDIT_OFFER_LIST_TXT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

/**
 *
 * @author litio
 */
public class Public_edit_Offer implements Question<String> {
    
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(the((PUBLIC_EDIT_OFFER_LIST_TXT), isVisible()));
        return Text.of(PUBLIC_EDIT_OFFER_LIST_TXT).answeredBy(actor);
    }

    public static Public_edit_Offer message(){
        return new Public_edit_Offer();
    }
}
