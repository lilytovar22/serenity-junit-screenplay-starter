/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 *
 * @author litio
 */
public class OpenBrowser {

    private static final String URL_LOGIN = "http://a5t-ogi-frontend.s3-website-us-east-1.amazonaws.com/#/login/84";

    public static Performable toLoginPage() {
        return Task.where("{0} Go to Login Page", Open.url(URL_LOGIN));
    }

}
