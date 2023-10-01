package Worksheet001;

import java.util.Scanner;

public class Exercise007 {
    public static void main(String[] args) {
        double radius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the radius:");
        radius = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println("The radius is: "+ radius);
        System.out.println("The perimeter is: "+perimeter);
        System.out.println("The area is: " + area);
    }
}
