import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int temp =n;
        int y =0;
        String z = Integer.toString(n);
        int c = (int) z.length();
        while (temp !=0)
        {
            int x = temp%10;
            y +=(Math.pow(x,c));
            temp/=10;
        }
        if (y==n)
        {
            System.out.println("The Number is Armstrong");
        }
        else
        System.out.println("The Number is Not Armstrong");

    }
}
