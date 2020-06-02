package ktp_task6;
/** Создайте функцию, которая возвращает значение true, если само число является
палиндромом или любой из его потомков вплоть до 2 цифр (однозначное число -
тривиально палиндром).*/
import java.util.Scanner;

public class ex6_10 {

	 public static boolean palindromeDescendant(int num)    {
	        String number = Integer.toString(num);
	        StringBuilder input = new StringBuilder();
	        input.append(number);
	        while (input.length() > 1)   {
	        if (input.toString().equals(input.reverse().toString()))
	        	return true;
	        if (input.length() % 2 != 0)
	            return false;
	        String next = sumDigits(input.reverse().toString());
	            input.setLength(0);
	            input.append(next);
	        }
	        return false;
	    }
	  private static String sumDigits(String num) {
	        String result = "";
	        for (int i = 0; i < num.length() - 1; i+=2)  {
	            int sum = Character.digit(num.charAt(i), 10) + Character.digit(num.charAt(i + 1), 10);
	            result += Integer.toString(sum);
	        }
	        return result;
	    }

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		System.out.println(palindromeDescendant(in.nextInt()));
		in.close();
	}

}
