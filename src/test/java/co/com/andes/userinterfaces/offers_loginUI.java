/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 *
 * @author litio
 */
public class offers_loginUI {
    
    public static final Target INP_USERNAME = Target.the("Campo para ingresar nombre de usuario").located(By.xpath("//input[@placeholder='User']"));
    public static final Target INP_PASSWORD = Target.the("Campo para ingresar la contraseña").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_LOGIN = Target.the("Boton para enviar los datos del formulario").located(By.xpath("//button[@type=\"submit\"]"));
    public static final Target BTN_OK = Target.the("Boton que da OK a Welcome").located(By.xpath("//button[normalize-space()='OK']"));
}
