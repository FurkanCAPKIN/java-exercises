import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter the number: ");
        int number = input.nextInt();
        int number1 = number;

        int result=1;

        while (true){
            if (number == 0){
                break;
            }else if (number == 1){
                break;
            }else{
                result *= number;
                number--;
            }
        }
        System.out.print("\n" + number1 + "! = " + result);

    }
}