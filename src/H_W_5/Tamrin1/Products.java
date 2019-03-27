package H_W_5.Tamrin1;

public abstract class Products {

    protected String brand;
    protected double price;

    public Products(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public  double getPrice(){
        return this.price;
    }

    public abstract String displayInformation();
}
