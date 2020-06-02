package ktp_task6;
/** Создайте функцию, которая принимает строку и возвращает true или false в
зависимости от того, является ли формула правильной или нет
formula("6 * 4 = 24") ➞ true*/
import java.util.Scanner;
import java.util.Vector;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ex6_9 {

public static boolean formula(String str) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String[] expressions = str.split("=");
        Vector<Integer> results = new Vector<Integer>();

        for (String expression : expressions)
        {
            results.add((Integer) engine.eval(expression));
        }

        int check = results.get(0);

        for (Integer value : results)
        {
            if (value != check)
                return false;
        }

        return true;

    }	

public static void main(String[] args) throws ScriptException {
		System.out.println(formula("6 * 4 = 24"));
	}

}
