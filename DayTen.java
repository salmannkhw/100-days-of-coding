// Day 10 of 100
// Just random coding
// Ill today but had to code something to maintain habit

import java.util.Scanner;

public class DayTen {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("Hello, ");

        stringBuilder.append("Java ").append("World"); 
        
        stringBuilder.insert(6, "Awesome ");
        
        stringBuilder.delete(6, 13);

        stringBuilder.replace(6, 7, " ");

        String result = stringBuilder.toString();

        System.out.println(result);
    }
}