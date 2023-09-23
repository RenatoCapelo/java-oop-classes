package Class001;

import java.util.ArrayList;
import java.util.Scanner;
public class Class001 {
    public static void main(String[] args) {

        int currentNumber = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersArr = new ArrayList<>();

        do {
            System.out.println("Numbers selected: ");
            for (int number:
                 numbersArr) {
                System.out.printf("%d ,", number);
            }
            System.out.println("Please input the next number, select 0 to finish inputting to the list");

            String lineRead = scanner.nextLine();

            try{
                currentNumber = Integer.parseInt(lineRead);
            }catch (NumberFormatException ex){
                System.out.println("Invalid Number");
            }

            if(currentNumber != 0)
                numbersArr.add(currentNumber);



        }while (currentNumber != 0);




        System.out.println("The prime numbers are:");


        for (int number: numbersArr) {
            if(isPrime(number))
                System.out.println(number);
        }
    }

    protected static boolean isPrime(int num){
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}