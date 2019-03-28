package Tamrin3;

public abstract class PhoneCall {

    protected String phoneNumber;
    protected double price;

    public PhoneCall(String phoneNumber){
        this.phoneNumber=phoneNumber;
        this.price=0.0;
    }
}
