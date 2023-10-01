package Worksheet001;

import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number: ");
        int numberSelected = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",numberSelected,i,numberSelected*i);
        }
    }
}
