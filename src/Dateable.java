//finding the age/2 + 7

import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your current age.");
        Integer age = scanner.nextInt();
        System.out.println(age + "-year olds should date somebody who is at least " + (age/2+7) + " years old.");
    }
}
