package Worksheet001;

public class Exercise003 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
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
