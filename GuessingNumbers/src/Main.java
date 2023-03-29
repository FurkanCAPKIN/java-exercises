import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("Write a number: ");
        int number = input.nextInt();

        while(true) {
            if (num == number) {
                System.out.println("You found!!!");
                break;
            } else if (num < number) {
                System.out.println("Down!");
                System.out.println("Write a number: ");
                number = input.nextInt();
            } else if (num > number){
                System.out.println("Up!");
                System.out.println("Write a number: ");
                number = input.nextInt();
            }else{
                break;
            }
        }
    }
}