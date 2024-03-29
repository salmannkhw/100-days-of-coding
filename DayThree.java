// Day 3 of 100. Practiced File handling today
// Fixed the error that were left from Day 2

import java.util.*;
import java.io.*;
public class DayThree {

    public static String path = "./High Score.txt";
    public static Scanner Take = new Scanner(System.in);
    
    public static void main (String[] args) throws IOException
    {
        int score;
        System.out.print("\nPlease enter your name: ");
        String yourName = Take.nextLine();
        score = runQuiz();
        System.out.println("\nThe top score is: " + scoreCheck(score, yourName));
    }

    public static int runQuiz() {
        ArrayList<String> Questions = new ArrayList<>(Arrays.asList("1. Who is the author of the Harry Potter series?\n\n1- J.R.R. Tolkien\n2- J.K. Rowling\n3- George R.R. Martin\n4- Suzanne Collins", "2. What is the name of Harry Potter's best friend?\n\n1- Ron Weasley\n2- Hermione Granger\n3- Neville Longbottom\n4- Draco Malfoy", "3. Which house does Harry Potter belong to at Hogwarts?\n\n1- Hufflepuff\n2- Ravenclaw\n3- Gryffindor\n4- Slytherin", "4. What is the magical object that allows Apparition in the wizarding world?\n\n1- Floo Powder\n2- Portkey\n3- Invisibility Cloak\n4- Apparition is not facilitated by an object", "5. What is the name of Harry's pet owl?\n\n1- Crookshanks\n2- Scabbers\n3- Hedwig\n4- Fang", "6. Who is the headmaster of Hogwarts in the first book?\n\n1- Albus Dumbledore\n2- Severus Snape\n3- Minerva McGonagall\n4- Dolores Umbridge", "7. What magical creature guards the entrance to the Gryffindor common room?\n\n1- Hippogriff\n2- Thestral\n3- Acromantula\n4- The Fat Lady", "8. Which magical plant is known for its healing properties but is also dangerous?\n\n1- Devil's Snare\n2- Mandrake\n3- Venomous Tentacula\n4- Whomping Willow", "9. What is the primary ingredient in Polyjuice Potion?\n\n1- Mandrake Root\n2- Boomslang Skin\n3- Fluxweed\n4- Bezoar", "10. What is the spell used to unlock doors and objects?\n\n1- Expelliarmus\n2- Alohomora\n3- Wingardium Leviosa\n4- Petrificus Totalus"));
        int answer, score = 0;
        System.out.println("Welcome to Harry potter quiz. Please read the rules carefully:\n1. There will be in total 10 Questions.\n2. Each right answer will grant you 2 points.\n3. Every wrong answer will reduce 1 point.\n\nHave Fun...\n\n");
        System.out.println("----< Press Enter to Continue >----");
        Take.nextLine();
        System.out.println("\n\n\n----------------------------------------------\n\n\n\n\n\n");
        for(int i = 0; i<10; i++) {
            System.out.println("\n\n" + Questions.get(i));               // Print Question
            answer = Take.nextInt();                        // Take answer
            score = score + choose(i, answer);
        }
            if (score < 0) score = 0;
            System.out.print("\n\nYour final score is: " + score);
        return score;
    }

    public static int choose (int quest, int option) {
        int adjust = 0;
        switch (quest) {
            case 0: {
                if (option == 2)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 1: {
                if (option == 1)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 2: {
                if (option == 3)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 3: {
                if (option == 4)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 4: {
                if (option == 3)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 5: {
                if (option == 1)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 6: {
                if (option == 4)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 7: {
                if (option == 2)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 8: {
                if (option == 3)
                adjust = 2;
                else 
                adjust--;
                break;
            }
            case 9: {
                if (option == 2)
                adjust = 2;
                else 
                adjust--;
                break;
            }
                default:
                System.out.println("For me: Some issue with for Loop");
        }
        return adjust;
    }

    public static String scoreCheck(int currentScore, String name) throws IOException
    {
        String TopScore;
        File board = new File(path);
        

        if (!board.exists()) {
            BufferedWriter pen = new BufferedWriter(new FileWriter(path));
            board.createNewFile();
            pen.write(currentScore + " --> " + name + "\n");
            TopScore = (currentScore + " --> " + name + "\n");
            pen.close();
        }
        else 
            TopScore = scoreUpdate(currentScore, name);

        
        return TopScore;
    }

    public static String scoreUpdate (int Score, String name) throws IOException
    {
        int TopScore;
        BufferedReader look = new BufferedReader(new FileReader(path));
        String ExistingTop = look.readLine();
        look.close();
        int Index = ExistingTop.indexOf(' ');

        if (Index == 1) {
            TopScore = Integer.parseInt(ExistingTop.substring(0, 1));
        }
        else
        TopScore = Integer.parseInt(ExistingTop.substring(0, 2));

        if (Score > TopScore)
        {
        ExistingTop = Score + " --> " + name;
        BufferedWriter pen = new BufferedWriter(new FileWriter(path));
        pen.write(Score + " --> " + name + "\n");
        pen.close();
        }
        return ExistingTop;
    }

}