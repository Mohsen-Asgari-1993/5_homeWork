package Tamrin3;

public class OutGoingPhoneCall extends PhoneCall {

    private int time;

    public OutGoingPhoneCall(String phoneNumber, int time) {
        super(phoneNumber);
        setPrice();
        this.time = time;
    }

    public int getTime(){
        return this.time;
    }

    @Override
    public void setPrice() {
        super.price=0.04;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return 0.04;
    }

    @Override
    public void displayInformation() {
        System.out.println("Phone Number : "+getPhoneNumber()+"\trate per minute :"+getPrice()+"\tNumber of minutes : "+this.time +"\tTotal price :"+this.time*getPrice());

    }
    
}
