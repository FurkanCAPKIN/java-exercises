import java.util.Scanner;
import Mezun.MezunOgrenci;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lisans Öğrencisi oluşturmak için -> 1\n" +
                "Yüksek Lisans Öğrencisi oluşturmak için -> 2 ");
        int tercih = input.nextInt();

        if ( tercih == 1)
        {
            System.out.println("Öğrenci ismi: ");
            String isim = input.next();
            System.out.println("Öğrenci no: ");
            int no = input.nextInt();
            System.out.println("Öğrenci test1 notu: ");
            double test1 = input.nextDouble();
            System.out.println("Öğrenci test2 notu: ");
            double test2 = input.nextDouble();
            System.out.println("Öğrenci test3 notu: ");
            double test3 = input.nextDouble();

            Ogrenci lo = new LisansOgrencisi(isim,no,test1,test2,test3);

            System.out.println("Öğrenci not ortalamasi: "+lo.ortHesaplama(test1,test2,test3));
            System.out.println("Öğrenci harf ortalaması: "+lo.notlandirma(lo.ortHesaplama(test1,test2,test3)));

        }else if ( tercih == 2)
        {
            System.out.println("Öğrenci ismi: ");
            String isim = input.next();
            System.out.println("Öğrenci no: ");
            int no = input.nextInt();
            System.out.println("Öğrenci test1 notu: ");
            double test1 = input.nextDouble();
            System.out.println("Öğrenci test2 notu: ");
            double test2 = input.nextDouble();
            System.out.println("Öğrenci test3 notu: ");
            double test3 = input.nextDouble();

            Ogrenci ylo = new YuksekLisansOgrencisi(isim,no,test1,test2,test3);

            System.out.println("Öğrenci not ortalamasi: "+ylo.ortHesaplama(test1,test2,test3));
            System.out.println("Öğrenci harf ortalaması: "+ylo.notlandirma(ylo.ortHesaplama(test1,test2,test3)));


        }else
        {
            System.out.println("Yanlış tercih yaptınız.");
        }



        MezunOgrenci mezunOgrenci = new MezunOgrenci("Furkan",2024,95);


    }
}