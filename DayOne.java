// Day 1 of 100. Practiced File handling today
import java.io.*;

public class DayOne {
    public static String path = "./Sample.txt";
    
    public static void main(String[] args) throws IOException
    {
        File note = new File(path);
        while (!note.exists()) note.createNewFile();

        String name = "Coder";
        int counter = lastLine();
        writeIt(counter, name);
        readIt();
       
    }

    public static void writeIt (int count, String name) throws IOException
    {
        BufferedWriter pen = new BufferedWriter(new FileWriter(path, true));    // true is for enabling it to append
        pen.write(count + ". " + name + ".\n");
        pen.close();
    
    }

    public static void readIt () throws IOException
    {
        String s;
        BufferedReader look = new BufferedReader(new FileReader(path));
        while ((s=look.readLine())!=null) System.out.println(s);
        look.close();
    }
    public static int lastLine() throws IOException
    {
        int last=1;
        BufferedReader looks = new BufferedReader(new FileReader(path));
        while (looks.readLine() != null) last++;
        looks.close();
        return last;
    }

}