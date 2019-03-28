package Tamrin3;

public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("0000011111");
        OutGoingPhoneCall outGoingCall = new OutGoingPhoneCall("0001110001",54);
        incomingPhoneCall.displayInformation();
        outGoingCall.displayInformation();

        IncomingPhoneCall incomingPhoneCall1 = new IncomingPhoneCall("0202020202");
        OutGoingPhoneCall outGoingCall1 = new OutGoingPhoneCall("333330000",15);
        incomingPhoneCall1.displayInformation();
        outGoingCall1.displayInformation();
    }
}
