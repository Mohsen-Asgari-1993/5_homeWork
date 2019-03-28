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

        do {
            if (choice == 3)
                break;
            switch1:
            switch (choice) {
                case 1: {
                    for (int i = 0; i < lenght; i++) {
                        System.out.print(i + 1 + " : ");
                        System.out.println(products[i].displayInformation());
                    }
                    break;
                }
                case 2: {
                    System.out.println("1) My Cart list");
                    System.out.println("2) Add to My Cart");
                    System.out.println("3) Edit My Cart");
                    System.out.println("4) My Cart Price");
                    System.out.println("5) Final Confrimation");
                    System.out.println("6) Back");
                    System.out.println("PLease Choose a number : ");
                    int choice2 = scanner.nextInt();

                    do {
                        if (choice2 == 6)
                            break switch1;
                        switch2:
                        switch (choice2) {
                            case 1: {
                                if (isNull) {
                                    System.out.println(" your Cart is Empty");
                                } else
                                    for (int i = 0; i < 5; i++) {
                                        if (userProducts[i] == null)
                                            break;
                                        System.out.print((i + 1) + " : ");
                                        System.out.println(userProducts[i].displayInformation());
                                    }
                                break;
                            }
                            case 2:
                                if (count == 5) {
                                    System.out.println(" Your Cart is full !!!");
                                    break;
                                } else {
                                    for (int i = 0; i < lenght; i++) {
                                        System.out.print(i + 1 + " : ");
                                        System.out.println(products[i].displayInformation());
                                    }
                                    System.out.println("which one???");
                                    int item = scanner.nextInt();
                                    for (int c : confrim) {
                                        if (c == item - 1) {
                                            System.out.println(" you can't add this item again!!!!");
                                            break switch2;
                                        }
                                    }
                                    confrim[count] = item - 1;
                                    userProducts[count] = products[item - 1];
                                    count++;
                                    isNull = false;
                                    break;
                                }
                            case 3: {
                                if (isNull) {
                                    System.out.println(" your Cart is Empty");
                                } else {
                                    for (int i = 0; i < 5; i++) {
                                        if (userProducts[i] == null)
                                            break;
                                        System.out.print((i + 1) + " : ");
                                        System.out.println(userProducts[i].displayInformation());
                                    }
                                    System.out.println("which one You want to delete?");
                                    int item = scanner.nextInt();
                                    int count1 = count - 1;
                                    for (int i = item - 1; i < 4; i++) {
                                        if (userProducts[i] == null)
                                            break;
                                        userProducts[i] = userProducts[i + 1];
                                        confrim[i] = confrim[i + 1];
                                        userProducts[count1] = null;
                                        confrim[count1] = -5;
                                        count1--;
                                    }
                                }
                                count--;
                                break;
                            }
                            case 4: {
                                double total = 0;
                                for (int i = 0; i < 5; i++) {
                                    if (userProducts[i] == null)
                                        break;
                                    total += userProducts[i].getPrice();
                                }
                                System.out.println("Total price:" + total);
                                break;
                            }
                            case 5: {
                                if (isNull) {
                                    System.out.println(" your Cart is Empty");
                                } else {
                                    for (int h = 0; h < 4; h++) {
                                        if (confrim[h] < confrim[h + 1]) {
                                            int temp = confrim[h];
                                            confrim[h] = confrim[h + 1];
                                            confrim[h + 1] = temp;
                                        }
                                    }
                                    int k = products.length - 1;
                                    for (int i = 0; i < count; i++) {
                                        for (int j = confrim[i]; j < products.length - 1; j++) {
                                            products[j] = products[j + 1];
                                        }
                                        products[k] = null;
                                        k--;
                                        confrim[i] = -5;
                                        userProducts[i] = null;
                                    }
                                    lenght -= count;

                                    count = 0;
                                    isNull = true;
                                    break;
                                }
                                break ;
                            }
                            default: {
                                System.out.println("Please enter a valid number ");
                                break;
                            }
                        }
                        System.out.println("\n1) My Cart list");
                        System.out.println("2) Add to My Cart");
                        System.out.println("3) Edit My Cart");
                        System.out.println("4) My Cart Price");
                        System.out.println("5) Final Confrimation");
                        System.out.println("6) Back");
                        System.out.println("PLease Choose a number : ");
                        choice2 = scanner.nextInt();
                    } while (choice2 != 6);
                }

                default: {
                    System.out.println("Please enter a valid number ");
                    break;
                }
            }
            System.out.println("\n1) Product list");
            System.out.println("2) My Cart");
            System.out.println("3) Exit");
            System.out.println("PLease Choose a number : ");
            choice = scanner.nextInt();
        } while (choice != 3);
        System.out.println(" have nice day ");
    }
}
