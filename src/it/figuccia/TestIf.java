package it.figuccia;
import java.util.Scanner;

public class TestIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String myName = scanner.nextLine();

        if (myName.length() % 2 == 0) {
            System.out.println("The number of letters in my name is even.");
        } else {
            System.out.println("The number of letters in my name is odd.");
        }

    }
}
