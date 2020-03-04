package arraylists;

public class Solution {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addGroceryItem("Banana");
        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Apple");
        groceryList.addGroceryItem("Beans");
        groceryList.addGroceryItem("Water");
        groceryList.addGroceryItem("Bread");

        groceryList.printGroceryList();
    }
}
