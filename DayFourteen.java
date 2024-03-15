// Day 14 of 100
// Learned Thread LifeCycle [ New (Born), Runnable, Timed waiting state, Waiting state, Terminated state, Blocked State]
public class DayFourteen {

    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();     // Born state
        ThreadTwo t2 = new ThreadTwo();
        t1.start();                         // Runnable state
        try {
            t1.join();                      // put main to waiting state
        } catch (Exception e) {}
        t2.start();

System.out.println("========================= t1 end =========================");
        
    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + ". t1");
            try {
                Thread.sleep(1000);                     // put into Timed waiting state. can be done by join(args) method as well
            } catch (Exception e) {}   
        }
    }

}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + ". t2");
            try {
                Thread.sleep(1000);                     // put into Timed waiting state. can be done by join(args) method as well
            } catch (Exception e) {}    
        }
    }


}