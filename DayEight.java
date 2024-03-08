// Day 8 of 100
// Hangman

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class DayEight {
    public static void main(String[] args) throws IOException
    {
        int fail = 0;
        char playerChoice;
        Scanner Take = new Scanner(System.in);
        System.out.println("Let's play Hangman.");
        String Movie = getWord().toUpperCase();
        System.out.println(Movie);  // remove later
        
        List <Character> guess = new ArrayList<>();
        while (fail < 7){
            printProgress(guess, Movie);
            System.out.println("Enter a letter\n");
            playerChoice = Take.next().toUpperCase().charAt(0);
            guess.add(playerChoice);
            if (Movie.contains(String.valueOf(playerChoice))) {
                System.out.println(playerChoice +" exists\n");}
            else{
                fail++;
                if (fail==7) {
                    System.out.println("Game Over. The Movie was: " + Movie);
                }
                System.out.println(playerChoice + " - Does not exist.\nRemaining tries are: " + (7-fail) + "\n");
                
            }
            
        }
            Take.close();
    }

    public static void printProgress(List words, String movie) {
        for (int i = 0; i < movie.length(); i++) {      // Print word
            if (words.contains(movie.charAt(i)))
            System.out.print(movie.charAt(i));
            else if (movie.charAt(i) == ' ')
            System.out.print(" ");
            else
            System.out.print("_");
        }
    }

    public static String getWord () throws IOException {

        Scanner read = new Scanner(new File("./Inherit/Movies.txt"));
        List <String> movieList = new ArrayList<>();
        while (read.hasNext()){
            movieList.add(read.nextLine());
        }
        read.close();
        Random dice = new Random();
        String myMovie = movieList.get(dice.nextInt(movieList.size()));
        return myMovie;
    }

}
