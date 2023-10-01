package Worksheet001;

import java.util.Scanner;

public class Exercise006 {
    public static void main(String[] args) {
        double width, height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the width: ");
        width = Double.parseDouble(scanner.nextLine());

        System.out.println("Insert the height: ");
        height = Double.parseDouble(scanner.nextLine());


        double area = width * height;
        double perimeter = 2*(width+height);

        System.out.printf("Area is %.2f * %.2f = %.2f\n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f\n", width, height, perimeter);
    }
}
