// Day 15 of 100
// Mutual Exclusive synchronized

public class DayFifteen {

    public static void main(String[] args) {
        Tables tables = new Tables();
        TableTwo t2 = new TableTwo(tables);
        TableThree t3 = new TableThree(tables);
        t2.start();
        t3.start();
        

    }
}

class Tables {

    public void printTable (int num) {
        synchronized (this) {
            for (int i = 1; i <= 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }}
    }

}

class TableTwo extends Thread {
    Tables tab;
    TableTwo(Tables T) {
        tab = T;
    }

    @Override
    public void run() {
        tab.printTable(2);
    }

}

class TableThree extends Thread {
    Tables tab;
    TableThree(Tables T) {
        tab = T;
    }
    
    @Override
    public void run() {
        tab.printTable(3);
    }

}

