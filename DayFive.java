// Learned and practicing Inheritence

import Inherit.*;
public class DayFive {
    public static void main(String[] args) {
        
        Adult Salman = new Adult();
        Kid Sam = new Kid();
        Salman.office = "ABC.Co";
        Salman.salary = 123456;
        Sam.school = "XYZ high school";
        Sam.marks = 52.32f;
        
        System.out.println(Salman.office);
        System.out.println(Sam.marks);
        Sam.sleep(2);

        
    }
}