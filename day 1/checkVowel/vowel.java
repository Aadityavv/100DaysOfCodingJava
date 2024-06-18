package checkVowel;
import java.util.*;
public class vowel {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int c=0;
     System.out.println("Enter a String");
     String str=sc.nextLine();
     for(int i=0;i<=str.length()-1;i++){
        char ch= str.charAt(i);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='i'||ch=='O'||ch=='U') {
            c+=1;
        }
     }
     if(c>0)
     System.out.println("Yes the given string contains Vowels. The number of Vowel(s) are: "+c);
     else
     System.out.println("No it does not contain Vowels");
    }
}
