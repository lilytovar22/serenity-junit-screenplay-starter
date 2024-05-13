/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.actors;

/**
 *
 * @author litio
 */
public enum Users {

    AnalistaImportacion("ismael.carvajal@castor.com.co", "");
    public final String username;
    public final String password;

    Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
