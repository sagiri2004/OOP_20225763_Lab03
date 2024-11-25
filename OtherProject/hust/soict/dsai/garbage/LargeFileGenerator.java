package hust.soict.dsai.garbage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LargeFileGenerator {
    public static void main(String[] args) {
        String filename = "largefile.txt";
        int lines = 1000;
        String content = "Ra xa hoi lam an.\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < lines; i++) {
                writer.write(content);
            }
            System.out.println("File largefile.txt da dc tao");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

