package H_W_5.Tamrin1;

public class Readable extends Products {
    private Person person;
    private String subject;

    public Readable(String brand, double price, Person person) {
        super(brand, price);
        this.person = person;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String displayInformation(){
        return "Book\tTitle: " + super.brand +"\t\tWritter: "+this.person.getFirstName()+" "+this.person.getLastName()+"\t\tSubject:"+this.subject+"\t\tPrice: "+super.price;
    }
}
