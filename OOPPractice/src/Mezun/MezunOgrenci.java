package Mezun;
public class MezunOgrenci
{
    private String isim="";
    private int mezuniyetNotu =0;
    private int mezuniyetTarihi=0;

    public MezunOgrenci (String isim, int mezuniyetTarihi, int mezuniyetNotu)
    {
        this.isim=isim;
        this.mezuniyetNotu= mezuniyetNotu;
        this.mezuniyetTarihi=mezuniyetTarihi;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMezuniyetNotu(int mezuniyetNotu) {
        this.mezuniyetNotu = mezuniyetNotu;
    }

    public void setMezuniyetTarihi(int mezuniyetTarihi) {
        this.mezuniyetTarihi = mezuniyetTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public int getMezuniyetNotu() {
        return mezuniyetNotu;
    }

    public int getMezuniyetTarihi() {
        return mezuniyetTarihi;
    }

}