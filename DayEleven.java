// Day 11 of 100
// I had a text file filled with 3513 contact numbers. I had to delete duplicates from them and create new file with no recurring numbers.
// This can be easily done in excel but I had to look for some topic to code so I made this my today's mini project.
// Ofcourse for privacy reasons I cannot share the num file.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class DayEleven {

    public static void main(String[] args) throws IOException
    {
        HashSet <String> rawNumList = new HashSet<>();

        Scanner Take = new Scanner(new File("./Files/NumDb.txt"));
        while (Take.hasNext()) {
            rawNumList.add(Take.nextLine());
        }
        System.out.println(rawNumList.size());
        Take.close();
        
        BufferedWriter pen = new BufferedWriter(new FileWriter("Files/NewNumDB.txt"));
        for (String element : rawNumList) {
            pen.write(element);
            pen.newLine(); // Add a newline for each element

    }
    pen.close();
}
}