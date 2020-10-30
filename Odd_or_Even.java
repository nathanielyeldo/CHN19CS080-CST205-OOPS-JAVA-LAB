import java.io.*;
import java.util.*;
public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = scan.nextInt();
        //Checking if num is odd or even
        if (n % 2 ==0)
        System.out.printf("%d is an even number \n",n);
        else 
        System.out.printf("%d is an odd number \n",n);
        scan.close();
    }
}
