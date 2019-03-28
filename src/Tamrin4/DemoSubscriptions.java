package Tamrin4;

public class DemoSubscriptions {
    public static void main(String[] args) {

        PhisycalNewspaperSubscription pns = new PhisycalNewspaperSubscription("ali", "ghgjkhlgj");
        System.out.println(pns.getRate() + "\t" + pns.getAddress() + "\t" + pns.getName());

        OnlineNewspaperSubscription ons = new OnlineNewspaperSubscription("ali", "kjhgjhgkhk");
        System.out.println(ons.getRate() + "\t" + ons.getAddress() + "\t" + ons.getName());

        PhisycalNewspaperSubscription pns2 = new PhisycalNewspaperSubscription("mohsen ", "jfhh7kll");
        System.out.println(pns2.getRate() + "\t" + pns2.getAddress() + "\t" + pns2.getName());

        OnlineNewspaperSubscription ons2 = new OnlineNewspaperSubscription("mat", "kjhgjhgk@hk");
        System.out.println(ons2.getRate() + "\t" + ons2.getAddress() + "\t" + ons2.getName());

    }
}
