package H_W_5.Tamrin1;

import java.util.Scanner;

public class Person {

    Scanner scanner = new Scanner(System.in);

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setUserName() {
        System.out.println("Please Enter your User Name:");
        this.userName = scanner.next();
    }

    public void setPassword() {
        System.out.println("Please Enter your Password:");
        this.password = scanner.next();
    }

    public void setPhoneNumber() {
        System.out.println("Please Enter your Phone number:");
        this.phoneNumber = scanner.nextInt();
    }

    public void setEmail() {
        System.out.println("Please Enter your Email:");
        this.email = scanner.next();
    }

    public void setAddress() {
        System.out.println("Please Enter your Province:");
        String s = scanner.next() + " ";
        System.out.println("Please Enter your Town:");
        s += scanner.next() + " ";
        System.out.println("Please Enter your Street:");
        s += scanner.next() + " ";
        System.out.println("Please Enter your Postal code:");
        s += scanner.next() + " ";
        this.address = s;
    }

    public void setInformation() {
        setUserName();
        setPassword();
        setPhoneNumber();
        setEmail();
        setAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
