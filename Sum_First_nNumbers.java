//A Program to find the sum of first “n” natural numbers.
import java.io.*;
import java.util.*;
public class Sum_First_nNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many natural numbers: ");
        int n = scan.nextInt();
        int arr[] = new int[n]; 
        int sum=0;
        //reading the array
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        //finding the sum
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.printf("The sum of first %d natural numbers are : %d ",n,sum);
        scan.close();
    }
}