import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        System.out.println("Please write a word: ");
        name = input.nextLine();

        String reverse = "";
        int j = name.length();
        while (j > 0) {
            j--;
            reverse += name.charAt(j);

        }
        System.out.println("Reverse: " + reverse);

    }
}
