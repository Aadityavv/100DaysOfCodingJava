package fibonacciSeries_usingRecursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        int f=0;
        int s=1;
        int t;
        for(int i=0;i<n;i++){
            if (i==0) 
            System.out.print(f+" ");
            else if (i==1) {
                System.out.print(s+" ");
            }
            else{
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;
            }
        }
        
    }
}
