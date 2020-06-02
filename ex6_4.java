package ktp_task6;

import java.util.Scanner;

/** stripUrlParams("https://edabit.com?a=1&b=2&a=2") ➞
"https://edabit.com?a=2&b=2"*/ 

public class ex6_4 {

	static String stripUrl (String line, String ...par) {
	StringBuilder result = new StringBuilder();
	if (!line.contains("https://")) return "wrong enter";
	String search = line.substring(line.indexOf('?')+1); 
	result.append(line.substring(0, line.indexOf('?')+1));
	String [] param = search.split("&");
	for (int i =0; i< param.length; i++) {
		System.out.println(i + ": " + param[i]);
	}
	String  variable = "";
	System.out.println(param[1].subSequence(0,1));
	for (int i = 0; i < param.length; i++) {	
			if (variable.contains(param[i].subSequence(0,1))) {
				System.out.println(i);
				for (int j = 0; j < i; j++) {
					if (param[j].charAt(0) == param[i].charAt(0)) {
						param[j]= "";
					}
				}
			}
			else {
				variable += String.valueOf(param[i].charAt(0));
			}
		}	
		if (par.length > 0) {
			for (int i =0; i <param.length; i++) {		
				if ( String.valueOf(param[i].charAt(0)) == par[0]) {
					param[i] = "";
				}
			}  
		}
	//в результате получаем измененный массив строк 	
	for(int i = 0; i < param.length; i++) {
		result.append(param[i]);
	}
	return result.toString();
	}

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter Url");
		System.out.println(stripUrl(in.nextLine()));
		in.close();
	}

}

