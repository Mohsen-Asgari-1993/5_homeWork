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

        
    }
}
