package practice.pack.inventory;

public class Clothing extends AbstractProduct{

    private double size;
    private String fabricType;

    public Clothing(String name, String description, double price, int quantity, double size, String fabricType) {
        super(name, description, price, quantity);
        this.size = size;
        this.fabricType = fabricType;
    }

    @Override
    public String getDescription() {
        return "--Clothing--\nItem: " + name + "\nsize: " + size + "\nfabric type: " + fabricType;
    }
}
