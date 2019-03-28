package Tamrin4;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    public OnlineNewspaperSubscription(String name, String address) {
        super.name = name;
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
        if (address.contains("@")) {
            super.rate = "$9";
        } else {
            super.rate = "$0";
            System.out.println("Error : wrong address imported");
        }
    }
}
