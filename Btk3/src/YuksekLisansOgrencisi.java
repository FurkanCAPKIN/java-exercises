public class YuksekLisansOgrencisi extends ogrenci
{

    YuksekLisansOgrencisi (String name, int no, double test1, double test2, double test3)
    {
        this.name = name;
        this.no = no;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    String notlandirma (double ort)
    {
        if ( ort >= 80 )
        {
            return "Geçti";
        }else
        {
            return "Kaldı";
        }

    }

}
