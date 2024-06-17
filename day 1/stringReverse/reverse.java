package stringReverse;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=sc.nextLine();
        System.out.println("The reversed string is: " + reverseStr(str));
    }
    public static String reverseStr(String str) {
        String rev = "";
        int len= str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev+=str.charAt(i);
            // System.out.print(rev);   FOR DEBUGGING PURPOSE
        }
        return rev;
    }
}
