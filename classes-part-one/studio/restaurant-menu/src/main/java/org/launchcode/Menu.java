package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    // Fields

    // menu items into Array
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;
    //default constructor


    // Getters, Setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


// Instance Methods

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

    // Special Methods
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nDANISH RESTAURANT MENU\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }

}
