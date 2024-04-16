package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Menu Item (2 apps, 2 main, 1 dessert
        MenuItem item1 = new MenuItem("Frikadeller", "Danish Meatball made from pork", 13.00, "main course");
        MenuItem item2 = new MenuItem("Flæskesteg(Danish Roast Pork)", "Served with red cabbage and sliced apples", 12.00, "main course");
        MenuItem item3 = new MenuItem("Tarteletter", "Mini-tarts consist of a puff pastry shell that is filled with a creamy combination of chicken and asparagus.", 10.00, "appetizer");
        MenuItem item4 = new MenuItem("Pickled Herring", "Served with rye bread, boiled potatoes, and sour cream.", 10.00, "appetizer");
        MenuItem item5 = new MenuItem("Danish Waffle", "Pastery rolled in sugar and baked, filled with raspberry and buttercream frosting", 3.50, "dessert");
        MenuItem item6 =  new MenuItem("Danish Roll", "Sweet roll filled with custard, jam or marzipan", 2.95, "dessert");

        // Menu
        //  1. Create several items and add them to a menu.
        Menu menu = new Menu();
        // add to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);

    //   2. Print the entire, updated menu to the screen.
        System.out.println(menu);

//     3. Print an individual menu item to the screen.
        System.out.println(item1);

//     4.  Delete an item from a menu, then reprint the menu.
        menu.removeItem(item5);
        // print menu
        System.out.println(menu);


    }
}
