package Inherit;

public class Person {
    public static String eats = "Food";
    public static String drink = "Water";
    int age;
    char gender;    // M/F
    public void sleep () {
        System.out.println("zzZZzzZZzZzZ");
    }
    public void sleep (int hours) {
        for (int i = 0; i < hours; i++) {
            System.out.print("Zz");
        }

    }
}



