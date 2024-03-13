// Day 13 of 100
// Multi Threading
// Sleep()
// join ()  - misuse can lead to deadlock
// Deadlock
// Runnable interface - since Threads extends your class, if we need to inherit another parent class, we can use Runnable interface.

public class DayThirteen {
    
    public static void main(String[] args) throws InterruptedException  // checked exception for join () method
    {
        ThreadOne t1 = new ThreadOne();         // born state
        ThreadTwo th = new ThreadTwo();
        Thread t2 = new Thread(th);
        t1.start();                             // runable state
        t1.join();                              // Stops execution of the thread that calls this method
        t2.start();
        System.out.println("========================= t1 state is now dead ======================");
    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        // try { this.join(); }         Creates a deadlock
        // catch (Exception e) {}
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". First thread");
            try {
                Thread.sleep(1);                // blocked state
            } catch (Exception e) {}

        } 
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". second thread");
            try {
                Thread.sleep(1);
            } catch (Exception e) {}
        } 
    }
}