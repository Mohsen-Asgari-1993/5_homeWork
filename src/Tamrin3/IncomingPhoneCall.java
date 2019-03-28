package Tamrin3;

public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 0.02;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public void displayInformation() {
        System.out.println("Phone Number : "+getPhoneNumber()+"\trate (price):"+getPrice());
    }
}
