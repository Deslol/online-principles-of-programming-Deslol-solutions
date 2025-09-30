
/*
 * Implement below a method (or methods) which allows the user to
 * type in their name, age and height in cm and prints to the terminal
 * their name, age, year of birth and height in feet and inches.
 *
 * For example, you might print out,
 *
 * "Hello <name>, you are <age> and were born in <year>.
 * You are <?> feet and <?> inches tall"
 */

import java.io.*;
import java.time.Year;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main instance = new Main();
        instance.solutionWithBufferReader();
    }

    public String cmToFtInches(int cm) {
        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);
        return String.format("You are %d feet and %d inches tall", feet, inches);
    }

    // Helper function
    public void greetingWithInfos(String name, int age, int year) {
        System.out.printf("Hello %s, you are %s and were born in %s.", name, age, year);
        System.out.println();
    }

    // With buffer reader
    public void solutionWithBufferReader() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String name;
            Main W5L4 = new Main();

            System.out.println("Please type your name: ");
            name = br.readLine();
//            System.out.println("Please type your age: ");
//            age = br.readLine();
            System.out.println("What's your year of birth: ");
            int birthYear = Integer.parseInt(br.readLine());
            int age = Year.now().getValue() - birthYear;
            System.out.println("How tall are you in cm?: ");
            int cm = Integer.parseInt(br.readLine());
            String heightStr = W5L4.cmToFtInches(cm);
            W5L4.greetingWithInfos(name, age, birthYear);
            System.out.print(heightStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        } catch (IOException e) {
            System.out.println("Unexpected Error Occurred! Please try again later!");
            return;
        }
    }
}


// With scanner