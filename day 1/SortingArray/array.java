package SortingArray;
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            if (i<n-1) {
                System.out.print(arr[i]+",");       
            }
         else
         System.out.print(arr[i]);
        }
    }
}
