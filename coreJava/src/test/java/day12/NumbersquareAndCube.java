package day12;

import java.util.Scanner;

public class NumbersquareAndCube {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number : ");
            if (!scn.hasNextLong()) {
                System.out.println("Exiting program.");
                break;
            }
            long num = scn.nextLong();

            System.out.println("Enter 1 to get square \nEnter 2 to get cube \nEnter any other number to exit");
            int select = scn.nextInt();

            if (select == 1) {
                long square = num * num;
                System.out.println(num + " squared is: " + square);
            } else if (select == 2) {
                long cube = num * num * num;
                System.out.println(num + " cubed is: " + cube);
            } else {
                System.out.println("Exiting program.");
                break;
            }
            System.out.println(); // Blank line for readability between iterations
        }

        scn.close();
    }
}
