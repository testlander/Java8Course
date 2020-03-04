package arraylists;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (String item:groceryList
             ) {
            System.out.println((groceryList.indexOf(item) + 1) + ". " + item);
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get((position));
        }
        return null;
    }
}
