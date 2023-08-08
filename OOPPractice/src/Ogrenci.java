public class Ogrenci
{
    String name="";
    int no=0;
    double test1=0;
    double test2=0;
    double test3=0;


    double ortHesaplama (double test1, double test2, double test3)
    {
        double ort = (test1+test2+test3) / 3;
        return ort;
    }

    String notlandirma (double ort)
    {
        return "ogrenci sınıfı";
    }
}
