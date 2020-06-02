package ktp_task6;

import java.util.ArrayList;
import java.util.Scanner;

/**Напишите функцию, которая извлекает три самых длинных слова из заголовка
газеты и преобразует их в хэштеги. Если несколько слов одинаковой длины,
найдите слово, которое встречается первым.  */ 
/** getHashTags("How the Avocado Became the Fruit of the Global Trade")
➞ ["#avocado", "#became", "#global"] */
public class ex6_5 {

	static ArrayList<String> getHashTags (String line) {
		String [] words = line.split(" ");
		int [] lg = new int[words.length];
		for (int i = 0; i< lg.length; i++) {
			lg[i] = words[i].length();
		}
		ArrayList<String> result  = new ArrayList<String>();
		for (int j = 0; j<3 ; j++) {
			//finding max value and it's number 
			double max = Double.MIN_VALUE;	
			int number_max = lg[0];
			for (int i = 0; i < lg.length; i++) {
				 if (lg[i] > max) {
		              max = lg[i];
		            number_max = i;
		          }
		      }		
			result.add(words[number_max]);
			lg[number_max]=0;
		}
		return result;
			}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line");
		System.out.println(getHashTags(in.nextLine()));
		in.close();
	}

}
