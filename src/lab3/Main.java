package lab3;
import java.io.File;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Path inputPath = Paths.get("studenti_in.txt");
        Path outputPath = Paths.get("studenti_out_sorted.txt");

        try
        {
            List<String> lines = Files.readAllLines(inputPath);
            List<Student> studenti = new ArrayList<>();

            for (String line : lines)
            {
                if (!line.trim().isEmpty())
                {
                    studenti.add(new Student(line));
                }
            }
            Collections.sort(studenti, new Comparator<Student>()
            {
                public int compare(Student s1, Student s2)
                {
                    int res = s1.grupa.compareTo(s2.grupa);
                    if (res != 0)
                    {
                        return res;
                    }
                    return s1.nume.compareTo(s2.nume);
                }
            });
            List<String> outputLines = new ArrayList<>();
            for (Student s : studenti)
            {
                outputLines.add(s.toString());
            }
            Files.write(outputPath, outputLines);
            System.out.println("Fisierul 'studenti_out_sorted.txt' a fost generat cu succes.");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


