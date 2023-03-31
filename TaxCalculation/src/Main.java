import java.util.Scanner;

public class Main {

    public int taxCalculate (int price) {
        int newPrice = price + ((price * 18)/100);
        // %18 kdv hesaplandı.
        return newPrice;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int price = input.nextInt();
        int realPrice = obj.taxCalculate(price);
        System.out.println(price + " taxed value of enter price: " + realPrice);
    }
}