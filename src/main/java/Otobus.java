public class Otobus extends YolcuTasiyanlar implements IYolcu{
    String  koltukYapisi;
    public Otobus(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi, String koltukYapisi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz , koltukSayisi);
        this.koltukYapisi=koltukYapisi;

    }

    public String getKoltukYapisi() {
        return koltukYapisi;
    }

    public void setKoltukYapisi(String koltukYapisi) {
        this.koltukYapisi = koltukYapisi;
    }


    @Override
    public String toString() {
        return "Otobus{" +
                "koltukYapisi='" + koltukYapisi + '\'' +
                ", koltukSayisi=" + koltukSayisi +
                ", id=" + id +
                ", hiz=" + hiz +
                ", kullanimTuru='" + kullanimTuru + '\'' +
                ", yolcuKapasitesi='" + yolcuKapasitesi + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    @Override
    public void yolcuBindir() {
        System.out.println("Otob�se yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Otob�sden yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Otob�s h�zlan�yor...");
        this.hiz+=10;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Otob�s yava�l�yor...");
        this.hiz=10;
    }
}
