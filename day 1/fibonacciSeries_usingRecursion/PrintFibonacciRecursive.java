import java.util.*;
public class PrintFibonacciRecursive {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of terms: ");
			int n= sc.nextInt();
			System.out.println("Fibonacci Series: ");
			for (int i = 0; i < n; i++) {
				System.out.print(recurssion(i)+" ");
			}

	}
	public static int recurssion (int n) {
		if (n<=1) {
			return n;
		}
		return recurssion(n-1) + recurssion(n-2);
	}
}