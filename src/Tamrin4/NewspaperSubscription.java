package Tamrin4;

public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected String rate;

    public String getAddress() {
        return address;
    }

    public abstract void setAddress(String address);

    public String getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
