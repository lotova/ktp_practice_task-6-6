package ktp_task6;
/** Создайте функцию, которая принимает число n и возвращает n-е число в
последовательности Улама.*/
import java.util.Scanner;
import java.util.Vector;

public class ex6_6 {
	
 static int ulam(int n) {
     Vector<Integer> values = new Vector<Integer>();
     values.add(1);
     values.add(2);
        for (int i = 3; i < 2000; i++)  {
           int count = 0;
            for (int j = 0; j < values.size() - 1; j++) {
                for (int k = j + 1; k < values.size(); k++)  {
                    if (values.get(j) + values.get(k) == i)
                        count++;
                }
            }
        if (count == 1)
             values.add(i);
         if (values.size() == n)
             return i;
        }
        return -1;
    }

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter number");
	System.out.println(ulam(in.nextInt()));
	in.close();
	}

}
