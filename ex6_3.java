package ktp_task6;

import java.util.Scanner;

/**Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых
значений допустимым или нет. Создайте функцию, которая принимает строку
(например, " rgb(0, 0, 0)") и возвраща*/
/** validColor("rgb(0,0,0)") ➞ true*/

public class ex6_3 {
	
	static boolean validColor (String line) {
	//должно начинаться с rgb
	if (!line.contains("rgb"))
        return false;
	//выбирается (0,0,0)
    String value = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
    //массивномеров для их подсчета и проверки
    String[] numbers = value.split(",");
    //формат rgba  - 4 параметра
    if (line.contains("rgba") && numbers.length != 4)
        return false;
    if (line.contains("rgb") && !line.contains("rgba") && numbers.length != 3)
        return false;
    //проверка что 0-255 норма цветов
    for (int i = 0; i < 3; i++) {
        if (Integer.parseInt(numbers[i]) < 0 || Integer.parseInt(numbers[i]) > 255)
            return false;
    }
    if (numbers.length == 4) {
        if (Double.parseDouble(numbers[3]) < 0 || Double.parseDouble(numbers[3]) > 1)
            return false;
    }
    return true;
}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter word");
		System.out.println("translated: " + validColor(in.nextLine()));
		in.close();
	}

}
