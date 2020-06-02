package ktp_task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex6_2 {
	
/** функция, возвращающая, является ли сивол гласной буквой*/ 
	static boolean isVow (char a) {
		String [] def = {"e","y","u","i","o","a"};
		if (Arrays.asList(def).contains(String.valueOf(a))){
			return true;
		} else return false;
	}

	static String translateWord(String word) {
		StringBuilder result = new StringBuilder();
		if (isVow(word.charAt(0))) {
			result.append(word)
			.append("yay");
		}else {
			int i = 0;
			StringBuilder consonants =  new StringBuilder();
			while (isVow(word.charAt(i)) == false) {
				consonants.append(word.charAt(i));
				i++;
			}
			result.append(word.substring(i))
			.append(consonants.toString())
			.append("ay");
		}
		return result.toString();
	}
	
	static String translateSentence(String line) {
		StringBuilder result = new  StringBuilder();
		String [] words = line.split(" ");
		for (String x: words) {
			x = translateWord(x);
			result.append(x);
			result.append(" ");
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter word");
		System.out.println("translated: " + translateWord(in.nextLine()));
		System.out.println("enter sentence");
		System.out.println("translated: " + translateSentence(in.nextLine()));
		in.close();
	}

}
