// Day 7 of 100
// Number guessing game
import java.util.*;

public class DaySeven {
    public static void main(String[] args) {
        int randomNumber, score = 1;
        Random rnum = new Random();
        Scanner Take = new Scanner(System.in);
        randomNumber = rnum.nextInt(101);
        System.out.println(randomNumber);
        System.out.println("Welcome to my number guessing game.\nI will generate a number between 1-100 and you will have to guess the number.\nAt each step I will tell you if the number you input greater or smaller than my number.\nLesser the number of steps, higher you score.\n  ------ press enter to continue ------");
        Take.nextLine();
        score = play(randomNumber, Take);
        System.out.println("My number is " + randomNumber + ". Your Score is " + (20-score));
        Take.close();
}


public static int play (int random, Scanner Take) {

    int guess, score=-1;
    while (true) {
        score++;
        System.out.print("Enter a number: ");
        guess = Take.nextInt();
        if (guess < random) System.out.println("My number is greater than you chose.");
        else if (guess > random) System.out.println("My number is lesser than you chose.");
        else {
            System.out.println("Your guess it correct.");
            break;
        }
        if (score == 20){
            System.out.println("You have reached maximum tries.");
            break;
        }
        
    }
        return score;
    }
}