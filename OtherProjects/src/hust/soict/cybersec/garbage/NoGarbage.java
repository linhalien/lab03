package hust.soict.cybersec.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "test.exe"; // Replace with the path to a large file
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            
            long startTime = System.currentTimeMillis();
            StringBuffer outputString = new StringBuffer();
            for (byte b : inputBytes) {
                outputString.append((char) b); // Efficient concatenation
            }
            long endTime = System.currentTimeMillis();
            
            System.out.println("Time taken (NoGarbage): " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
