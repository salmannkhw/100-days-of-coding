// Day 6 of 100 
// Encapsulation
// "this" keyword   - Does not exist in static function
// Constructor
// enum

import Inherit.Fish;

public class DaySix {
    public static void main(String[] args) {
        PInfo P1 = new PInfo();
        PInfo P2 = new PInfo("Admin 2");
        
        P1.setPassword("HelloWorld@123");
        System.out.println(P1.username);
        System.out.println(P1.getPassword());

        P2.setPassword("ABC@123");
        System.out.println(P2.username);
        System.out.println(P2.getPassword());
        System.out.println("\n=================================================================================================\n\n");
        System.out.println("Price of Arowana is: " + Fish.AROWANA.cost);
        System.out.println("Colors of guppy Available are: " + Fish.GUPPY.color);
    }
}


class PInfo {
    String username = "Admin 1";
    private String password;
    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
        return;
    } 
    public PInfo (String username) {
        this.username = username;
    }
    public PInfo () {
    }
}


