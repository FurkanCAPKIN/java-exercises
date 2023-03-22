import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the digits(if you want the stop enter 0): ");
        int i;
        int sum=0;
        int[] number = new int[100];
        for (i=0;i<100;i++){
            number[i] = input.nextInt();
            if (number[i]==0){
                break;
            }else {
                sum += number[i];
            }
        }

        System.out.println("Sum of the entered numbers: "+sum);

    }
}
