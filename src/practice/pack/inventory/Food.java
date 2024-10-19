package practice.pack.inventory;

import java.time.LocalDate;

public class Food extends AbstractProduct{

    private LocalDate expirationDate;

    public Food(String name, String description, double price, int quantity, LocalDate expirationDate) {
        super(name, description, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDescription() {
        return "--Food--\nItem: " + name + "\nExpiration date: " + expirationDate;
    }
}
