// Day 12 of 100
// I learned how to calculate time. Started learning Multi threading as well. WIll code in it tomorrow

import java.util.ArrayList;

public class DayTwelve {

    public static void main(String[] args) {
        timemillis();       // Timemillis method


    }
}

public static void timemillis () {
    ArrayList <Integer> counter = new ArrayList<>();
        
    double start = System.currentTimeMillis();
    for (int i = 0; i < 90000000; i++)
    {
        counter.add(i);
    }
    double end = System.currentTimeMillis();
    System.out.println(end - start);
    System.out.println(counter.size());
    end = System.currentTimeMillis();
    System.out.println(end - start);
}