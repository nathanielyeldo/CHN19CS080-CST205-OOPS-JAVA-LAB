//check given no is palindrome or not
import java.io.*;
import java.util.*;
import java.lang.Math;
public class Palindrome_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test: ");
        int n = scanner.nextInt();
        int temp = n;
        int y=0;
        String z = Integer.toString(n);
        int c = (int) z.length();
        c-=1;
        while(temp !=0)
        {
            int x = temp%10;
            y = y + (x * (int) Math.pow(10, c));
            System.out.println(y);
            c-=1;
            temp=temp/10;
        }
        if(y==n)
        {
        	System.out.println("The given number is a Palindrome");
        }
        else
        	System.out.println("The given number is Not a Palindrome");
        scanner.close();
    }
    
}
