public class Item {
    public String itemId;
    public String name;
    public int quantity;
    public double price;

    // Constructor
    public Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to update quantity
    public void updateQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
            System.out.println("Updated quantity of " + name + " to " + this.quantity);
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }

    // Getters for item details
    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Creating a new item
        Item item = new Item("105", "Mobile", 20, 999.99);

        // Displaying item details
        item.displayDetails();

        // Updating quantity
        item.updateQuantity(15);
        
        // Trying to update with negative quantity
        item.updateQuantity(-5);

        // Displaying item details again
        item.displayDetails();
    }
}
