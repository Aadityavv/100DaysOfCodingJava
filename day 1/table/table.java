package table;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number whose table you want to get printed");
        a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}