package practice.pack.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private List<AbstractProduct> inventory = new ArrayList<>();

    public void addProduct(AbstractProduct product) {
        inventory.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        inventory.remove(product);
    }

    public void printInventory() {
        for (Product product : inventory) {
            System.out.println(product.getDescription() + "\nPrice: " + product.getPrice() + "\nQuantity: " + product.getQuantity());
            System.out.println();
        }
    }

    public void searchItemByName() {
        Scanner sc = new Scanner(System.in);
        String itemName;

        do {
            System.out.print("Search for an item or type EXIT to quit the search: ");
            itemName = sc.nextLine();

            boolean found = false;

            if (itemName.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for choosing us!");
                break;
            }
            for (Product product : inventory) {
                if (product.getDescription().contains(itemName)||product.getName().contains(itemName)) {
                    System.out.println(product.getDescription() + "\n");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Item not found");
            }

        }while (!itemName.equalsIgnoreCase("exit")) ;

    }

    public void addToCart(){
        Scanner sc = new Scanner(System.in);
        String itemName;
        List<AbstractProduct> cart = new ArrayList<>();

        do {
            System.out.print("Search for an item you want to put in your cart or type EXIT to quit the search: ");
            itemName = sc.nextLine();

            boolean found = false;

            if (itemName.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for choosing us!");
                break;
            }
            for (Product product : inventory) {
                if (product.getDescription().contains(itemName)||product.getName().contains(itemName)) {
                    cart.add((AbstractProduct) product);
                    for (Product item : cart) {
                        System.out.println(item.getName());
                    }
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Item not found");
            }

        }while (!itemName.equalsIgnoreCase("exit")) ;

    }
}
