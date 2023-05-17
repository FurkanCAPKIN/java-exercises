import java.util.Scanner;

public class Main {

    static int bol(int pay, int payda) throws IllegalAccessException {

        if(payda==0){
            throw new IllegalAccessException("payda 0 olamaz");
        }

        return pay/payda;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pay;
        int payda;

        System.out.println("Payı giriniz :");
        pay = input.nextInt();

        System.out.println("Paydayı giriniz :");
        payda = input.nextInt();


        try{
            System.out.println(pay + " / " + payda + " = " + bol(pay,payda));
        }catch (IllegalAccessException rex){
            System.out.println("hata oluştu : "+rex.toString());
        }

    }
}