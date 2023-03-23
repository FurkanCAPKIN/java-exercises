import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int floor;
        System.out.print("Enter floor of the pyramid: ");
        floor = input.nextInt();

        int a,b,c,d;

        for (a = 0; a < floor; a++) {

            for (b = 0; b < (floor - a); b++) {
                //write spaces to the left of *
                System.out.print(" ");
            }
            for (c = 0; c < (2 * a + 1); c++) {
                //write *
                System.out.print("*");
            }
            for (d = 0; d < (2 * floor - 1) / 2; d++) {
                //write spaces to the right of *
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}