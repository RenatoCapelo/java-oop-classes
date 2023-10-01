package Worksheet001;

import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o 1º numero: ");
        Integer num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira o 2º numero: ");
        Integer num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);
    }
}
