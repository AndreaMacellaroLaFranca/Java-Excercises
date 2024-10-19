package practice.pack.inventory;
import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {
    public void begin(){
        Scanner sc = new Scanner(System.in);

        AbstractProduct laptop = new Electronics("Asus ZenBook", "The best laptop of 2024", 1080, 120,24);
        AbstractProduct smartphone = new Electronics("iPhone 16", "The best iPhone ever", 1200, 100,12);
        AbstractProduct hoodie = new Clothing("Woolrich hoodie", "Comfiest hoodie on the planet", 99,50,32,"Wool");
        AbstractProduct apple = new Food("Apple", "Best japanese apples", 2.99,300, LocalDate.of(2024, 12, 31));

        Inventory inventory = new Inventory();

        inventory.addProduct(laptop);
        inventory.addProduct(smartphone);
        inventory.addProduct(hoodie);
        inventory.addProduct(apple);
        inventory.printInventory();
        inventory.searchItemByName();
        inventory.addToCart();


    }
}
