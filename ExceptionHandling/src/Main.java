import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bolum;
        int payda;
        int pay;

        System.out.println("Payı giriniz: ");
        pay = input.nextInt();

        System.out.println("Paydayı giriniz: ");
        payda = input.nextInt();

        try {
            //Hata vermesi muhtemel olan yeri try bloğunun içine alıyoruz.
            bolum = (pay / payda);
            /*Eğer kod üst satırda hata verirse try bloğundan çıkar ve catch bloğuna geçer ve
             bu sebepten alttaki satır çalışmaz ama kod hata vermezse alttaki satır çalışır ve
             catch bloğuna girilmez. */
            System.out.println("Bölüm : "+new DecimalFormat("##.##").format(bolum));


        }catch (ArithmeticException ax){
            /* try bloğunda hata oluşması durumunda catch bloğu ile hatayı yakalayabiliriz. Catch
            bloğununa oluşması muhtemel hata türünü girer ve direkt istediğimiz hatayı yakalarız yada
            "Exception ex" hata türünü girerek bütün hataları yakalayabiliriz..*/

            System.out.println("Payda sıfır olamaz.");
        }




    }
}