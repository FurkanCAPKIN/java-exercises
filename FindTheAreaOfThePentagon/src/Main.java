import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + pentagonArea(side));
    }
    public static double pentagonArea(double s) {
        return  (5 * s * s) / (4 * Math.tan(Math.PI/5));
    }
}
