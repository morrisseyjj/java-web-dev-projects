
package org.launchcode;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class MenuItem {

    // Fields
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;
    private String name;


    // Constructors
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }


    // Getters, Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    // Instance Method
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        return daysBetween < 30;
    }

    // Special Method

    // To format the name, price, description and conditional new
    @Override
    public String toString() {
        String itemNew = isNew() ? " - NEW!" : "";
        return name + itemNew + "\n" + description + " | $" + price;
    }




}












