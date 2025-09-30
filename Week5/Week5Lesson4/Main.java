
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
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main instance = new Main();
        Scanner s = new Scanner(System.in);
        try {
//            instance.solutionWithBufferReader();
            instance.solutionWithScanner(s);
        }catch (Exception e) {
            return;
        }finally {
            s.close();
        }
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

    public void positiveOnlyWarning(String value) {
        System.out.printf("%s can be positive only, please try again.", value);
    }

    // With buffer reader
    public void solutionWithBufferReader() {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            Main W5L4 = new Main();

            System.out.println("Please type your name: ");
            String name = br.readLine();
//            System.out.println("Please type your age: ");
//            age = br.readLine();
            System.out.println("What's your year of birth: ");
            int birthYear = Integer.parseInt(br.readLine());
            if (birthYear < 0) {
                positiveOnlyWarning("Year of birth");
                return;
            }
            int age = Year.now().getValue() - birthYear;
            System.out.println("How tall are you in cm?: ");
            int cm = Integer.parseInt(br.readLine());

            if (cm <= 0) {
                positiveOnlyWarning("Height in cm");
                return;
            }
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

    // With scanner
    public void solutionWithScanner(Scanner s) {
        try {
            Main W5L4 = new Main();

            System.out.println("Please type your name: ");
            String name = s.nextLine();
//            System.out.println("Please type your age: ");
//            age = s.readLine();
            System.out.println("What's your year of birth: ");
            int birthYear = Integer.parseInt(s.nextLine());
            if (birthYear < 0) {
                positiveOnlyWarning("Year of birth");
                return;
            }
            int age = Year.now().getValue() - birthYear;
            System.out.println("How tall are you in cm?: ");
            int cm = Integer.parseInt(s.nextLine());

            if (cm <= 0) {
                positiveOnlyWarning("Height in cm");
                return;
            }
            String heightStr = W5L4.cmToFtInches(cm);
            W5L4.greetingWithInfos(name, age, birthYear);
            System.out.print(heightStr);
        }catch (Exception e){
            return;
        }
    }
}


