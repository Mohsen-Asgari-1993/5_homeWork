package Tamrin2;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Troy");
        NonFiction nonFiction = new NonFiction("ZIZI");
        fiction.displayInformation();
        nonFiction.displayInformation();
    }
}
