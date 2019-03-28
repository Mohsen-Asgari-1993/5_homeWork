package Tamrin3;

public class OutGoingPhoneCall extends PhoneCall {

    private int time;

    public OutGoingPhoneCall(String phoneNumber, int time) {
        super(phoneNumber);
        setPrice();
        this.time = time;
    }
}
