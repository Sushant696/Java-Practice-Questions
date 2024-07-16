// **3. Create a ShoppingCart class to simulate an online shopping cart. The class should have the following attributes: cart ID, customer name, and items (a list of products).

// Include methods to
// addItem(),   
// removeItem(),
// and calculateTotal().
// Implement functionality to create new shopping carts, add/remove items, and calculate the total cost of items in the cart.**

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        // Creating some items
        Item item1 = new Item("Laptop", 999.99);
        Item item2 = new Item("Smartphone", 599.99);

        // Creating a shopping cart and adding items
        ShoppingCart cart = new ShoppingCart(1, "Sushant Babu Prasai", new ArrayList<>());
        cart.addItem(item1);
        cart.addItem(item2);

        // Calculating the total cost of items in the cart
        double total = cart.calculateTotal();
        System.out.println("Total cost: " + total);
    }
}

class ShoppingCart {
    int cartID;
    String customerName;
    List<Item> items;

    ShoppingCart(int cartID, String customerName, List<Item> items) {
        this.cartID = cartID;
        this.customerName = customerName;
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
