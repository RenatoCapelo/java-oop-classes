package Class003;


import java.util.Scanner;

public class Exercise012 {
    public static void main(String[] args) {
        int num1,num2,num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert the second number: ");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert the third number: ");
        num3 = Integer.parseInt(scanner.nextLine());

        int maxNumber = num1;

        if(num2 > maxNumber)
            maxNumber = num2;
        if (num3 > maxNumber) {
            maxNumber = num3;
        }

        System.out.println("the max number is: "+maxNumber);

    }
}
