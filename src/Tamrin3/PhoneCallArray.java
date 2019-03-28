package Tamrin3;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[8];
        for (int i=0, j=1;i<=6;i+=2,j+=2){
            phoneCalls[i]=new IncomingPhoneCall("0937100001"+i);
            phoneCalls[j]=new OutGoingPhoneCall("0912445555"+j,j+10);
        }
        for(PhoneCall p:phoneCalls)
            p.displayInformation();
    }
}
