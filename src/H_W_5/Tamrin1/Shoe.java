package H_W_5.Tamrin1;

public class Shoe extends Products {
    private int size;
    private String color;
    private String type;

    public Shoe(String brand, double price, String type, int size, String color) {
        super(brand, price);
        this.type=type;
        this.size = size;
        this.color = color;
    }
}
