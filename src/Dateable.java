//finding the age/2 + 7

import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current age.");
        Integer age = scanner.nextInt();
        System.out.println("The youngest person you can date is " + (age/2+7) + " years old.");
    }
}
