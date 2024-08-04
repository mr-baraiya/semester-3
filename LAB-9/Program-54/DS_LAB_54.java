import java.util.Scanner;

public class DS_LAB_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        Feathers feathers = new Feathers();

        int choice;
        String color;
        do {
            System.out.println("Enter 1 for buy feather.");
            System.out.println("Enter 2 for fetch feather.");
            System.out.println("Enter -1 for exit the menu.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the color of feather to buy");
                    color = scanner.nextLine();
                    feathers.buy(color);
                    break;

                case 2:
                    System.out.println("Fetched feather is "+feathers.fetch());
                    break;
            
                default:
                    if(choice != -1) System.out.println("Invalid Input");
                    break;
            }
        } while(choice != -1);
        sc.close();
        scanner.close();
    }
}

class Node {
    String color;
    Node next;
    public Node(String color) {
        this.color = color;
    }
}

class Feathers {
    Node first;
    Node last;
    public Feathers() {
        this.first = null;
        this.last = null;
    }
    public void buy(String color) {
        Node new_color = new Node(color);
        if(first == null) {
            new_color.next = new_color;
            first = last = new_color;
            System.out.println("Feather successfully purchased.");
            return;
        }
        new_color.next = first;
        first = new_color;
        last.next = new_color;
        System.out.println("Feather successfully purchased.");
    }

    public String fetch() {
        if(first == null) {
            System.out.println("Queue is empty.");
            return "none";
        }
        if(first == last) {
            String temp = last.color;
            first = last = null;
            return temp;
        }
        Node current = first;
        while(current.next != last) {
            current = current.next;
        }
        String temp = last.color;
        current.next = first;
        last = null;
        last = current;
        return temp;
    }
}
