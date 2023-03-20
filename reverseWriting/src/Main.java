import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String isim;
        System.out.println("Please write a word: ");
        isim = input.nextLine();

        String reverse = "";
        int j = isim.length();
        while (j > 0) {
            j--;
            reverse += isim.charAt(j);

        }
        System.out.println("Reverse: " + reverse);

    }
}