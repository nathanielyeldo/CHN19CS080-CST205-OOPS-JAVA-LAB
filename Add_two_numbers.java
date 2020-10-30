//A program to add two numbers.
import java.io.*;
import java.util.Scanner;
public class Add_two_numbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the two numbers: \n");
        int vr1 = scan.nextInt();
        int vr2 = scan.nextInt();
        System.out.printf("%d + %d = %d \n",vr1,vr2,vr1+vr2);
        scan.close();
    }
}
