import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner sCanner = new Scanner(System.in);
        System.out.println("Please enter your age.");
        Integer age = sCanner.nextInt();
        System.out.println(age +  "-year olds should read at least " + (100-age) + " pages before giving up. ");

    }
}
