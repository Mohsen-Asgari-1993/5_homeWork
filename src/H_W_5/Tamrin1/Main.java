package H_W_5.Tamrin1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first name:");
        String firstName = scanner.next();

        System.out.println("please enter your last name:");
        String lastName = scanner.next();

        Person person = new Person(firstName, lastName);
        person.setInformation();

        TV tv = new TV("Samsung", 2500000, "B", 42, "LED");
        TV tv1 = new TV("LG", 47500000, "A", 65, "LED , OLED , Smart");
        TV tv2 = new TV("X-Vision", 1685000, "C", 24, "LED");
        Radio radio = new Radio("Panasonic", 369000, "B");
        Radio radio1 = new Radio("Marshal", 189000, "C");
        Shoe shoe = new Shoe("Nike", 850000, "Sport", 42, "Black");
        Shoe shoe1 = new Shoe("Puma", 550000, "Sport", 40, "Red");
        Shoe shoe2 = new Shoe("D & G", 1550000, "Formal", 44, "Black");
        Shoe shoe3 = new Shoe("LC ", 450000, "Formal", 43, "Brown");
        Person writter = new Person("Ghasem Ali", "Ferasat");
        Readable readable = new Readable("Nakhl haye bi sar", 50000, writter);
        readable.setSubject("epic");
        Person writter1 = new Person("Ahamd", "Mahmud");
        Readable readable1 = new Readable("Zamin e Sukhte", 80000, writter1);
        readable1.setSubject("epic");

        Products[] products = {tv, tv1, tv2, radio, radio1, shoe, shoe1, shoe2, shoe3, readable, readable1};
        Products[] userProducts = new Products[5];
        int[] confrim = {-5, -5, -5, -5, -5};
        boolean isNull = true;
        int lenght = products.length;
        int count = 0;
        System.out.println("1) Product list");
        System.out.println("2) My Cart");
        System.out.println("3) Exit");
        System.out.println("PLease Choose a number : ");
        int choice = scanner.nextInt();
    }
}
