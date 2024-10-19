package practice.pack.inventory;

public class Electronics extends AbstractProduct{

    private int warrantyPeriod;

    public Electronics(String name, String description, double price, int quantity, int warrantyPeriod) {
        super(name, description, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDescription() {
        return "--Electronics--\nItem: " + name + "\nWarranty: " + warrantyPeriod + " months";
    }
}
