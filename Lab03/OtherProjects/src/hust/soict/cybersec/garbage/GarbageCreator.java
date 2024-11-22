package hust.soict.cybersec.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        try {
            String filename = "test.exe"; // Replace with the path to a large file
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            
            long startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; // Inefficient concatenation
            }
            long endTime = System.currentTimeMillis();
            
            System.out.println("Time taken (GarbageCreator): " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
