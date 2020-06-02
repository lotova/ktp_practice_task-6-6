package ktp_task6;

import java.util.Scanner;

public class ex6_1 {

	 private static int C(int n, int k)
	    {
	        return factorial(n) / (factorial(k) * factorial(n - k));
	    }

	 private static int factorial(int n)
	    {
	        if (n == 0) return 1;
	        else
	        {
	            int result = 1;
	            for(int i = 2; i <= n; i++)
	            {
	                result *= i;
	            }
	            return result;
	        }
	    }
	/**найти число Белла */
	static int bell (int n) {
	        if (n == 0) return 1;
	        else
	        {
	            int sum = 0;
	            for (int k = 0; k < n; k++)
	            {
	                sum += C(n-1, k) * bell(n - k - 1);
	            }
	            return sum;
	        }
	    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter number");
		System.out.println(bell(in.nextInt()));
		in.close();
	}

}
