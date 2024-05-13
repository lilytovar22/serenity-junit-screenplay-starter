/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.andes.models;

/**
 *
 * @author litio
 */
public class EditOfferModel {
    
    public String protein;
    public String supplier;
    public String temperature;
    public String inconterm;
    public String qty;
    public String location;
    public String date;
    public String comment;

    public EditOfferModel(String protein, String supplier, String temperature, String inconterm, String qty, String location, String date, String comment) {
        this.protein = protein;
        this.supplier = supplier;
        this.temperature = temperature;
        this.inconterm = inconterm;
        this.qty = qty;
        this.location = location;
        this.date = date;
        this.comment = comment;
    }

    public EditOfferModel(String temperature, String inconterm, String date, String comment) {
        this.temperature = temperature;
        this.inconterm = inconterm;
        this.date = date;
        this.comment = comment;
    }

    public String getProtein() {
        return protein;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getInconterm() {
        return inconterm;
    }

    public String getQty() {
        return qty;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}
