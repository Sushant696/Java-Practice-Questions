
import java.util.ArrayList;

/*
 * Create a ShoppingCart class to simulate an online shopping cart. the class should have the following attributes:
 * cartId, customerName, and items(a list of products). include methods to addItem(),removeItem(), and calculateTotal()
 * Implement functionality to create new shopping carts, add/remove items, and calculate the total cost of items in the cart
 */

public class Qs3 {
    public static void main(String[] args) {

        ShoppingCart s1 = new ShoppingCart();
        s1.addItem(1, "Fish", 1000);
        s1.addItem(2, "Meow", 2000);
        s1.showCart(); // Before
        s1.removeItem(1);
        s1.showCart(); // After
        s1.calculateTotal();

    }
}

class ShoppingCart {
    int cartId;
    String customerName;
    ArrayList<Item> ItemsList = new ArrayList<Item>();

    void addItem(int itemId, String name, double price) {
        ItemsList.add(new Item(itemId, name, price));
        System.out.println("{itemId: " + itemId + ", name: " + name + ", price: " + price + " } => Item added!");
    }

    void removeItem(int itemId) {
        for (int i = 0; i <= this.ItemsList.size() - 1; i++) {
            if (ItemsList.get(i).itemId == itemId) {
                // System.out.println("True");
                // System.out.println(ItemsList.get(i));
                System.out.println(this.ItemsList.get(i) + " => Item removed!");
                this.ItemsList.remove(this.ItemsList.get(i));
            }
        }

    }

    void calculateTotal() {
        double total = 0;
        for (int i = 0; i <= this.ItemsList.size() - 1; i++) {
            total += this.ItemsList.get(i).price;
        }
        System.out.println("Total amount: " + total);

    }

    void showCart() {
        System.out.println("Cart: " + this.ItemsList);
    }

}

class Item {
    int itemId;
    String name;
    double price;

    Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ itemId: " + this.itemId + ", name: " + this.name + ", price: " + this.price + " }";
    }
}