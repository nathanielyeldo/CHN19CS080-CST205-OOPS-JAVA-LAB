//A Program to check if the  given no is prime or not.
import java.io.*;
import java.util.*;

public class Prime_or_not {

    static boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2 ==0 || n%3==0) return false;
        for(int i=5; i*i<n;i+=6)
        {
            if(n%i ==0 || n%(i+2) ==0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: \n");
        int n = scan.nextInt();
        // Checking if num is prime or not
        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        scan.close();    

    }
}
