package practice.pack.inventory;

public abstract class AbstractProduct implements Product{

    protected String name, description;
    protected double price;
    protected int quantity;

    public AbstractProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
