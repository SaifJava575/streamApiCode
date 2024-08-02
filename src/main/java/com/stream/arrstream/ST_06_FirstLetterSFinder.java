package com.stream.arrstream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ST_06_FirstLetterSFinder {

    public static void main(String[] args) {
        // Sample list of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Steve", "Samuel", "Charlie");

        // Find the first name that starts with 'S'
        Optional<String> firstWithS = names.stream()
                                           .filter(name -> name.startsWith("S"))
                                           .findFirst();

        // Print the result
        if (firstWithS.isPresent()) {
            System.out.println("The first name starting with 'S' is: " + firstWithS.get());
        } else {
            System.out.println("No name starts with 'S'.");
        }
    }
}
