package Tamrin4;

public class PhisycalNewspaperSubscription extends NewspaperSubscription {

    public PhisycalNewspaperSubscription(String name, String address) {
        super.name = name;
        setAddress(address);
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
        outer:
        for (int i = 0; i <= 9; i++) {
            if (address.contains(i + "")) {
                super.rate = "$15";
                break outer;
            } else if (i == 9) {
                super.rate = "$0";
                System.out.println("Error : wrong address imported");
            }
        }
    }
}
