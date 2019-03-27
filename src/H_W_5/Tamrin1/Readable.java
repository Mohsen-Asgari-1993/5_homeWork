package H_W_5.Tamrin1;

public class Readable extends Products {
    private Person person;
    private String subject;

    public Readable(String brand, double price, Person person) {
        super(brand, price);
        this.person = person;
    }
}
