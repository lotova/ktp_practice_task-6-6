package ktp_task6;
/** Напишите функцию, которая возвращает самую длинную неповторяющуюся
подстроку для строкового ввода.
longestNonrepeatingSubstring("abcabcbb") ➞ "abc"*/
import java.util.Scanner;

public class ex6_7 {

	static String longestNonrepeatingSubstring(String line) {
		String hash = "";
		for(int i =0; i< line.length(); i++) {
			if (!hash.contains(line.subSequence(i, i+1))) {
				hash+= String.valueOf(line.charAt(i));
			}		
		}
		return hash;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line ");
		System.out.println(longestNonrepeatingSubstring(in.nextLine()));
		in.close();
		
	}

}
