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
        System.out.println("Otobüse yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Otobüsden yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Otobüs hýzlanýyor...");
        this.hiz+=10;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Otobüs yavaþlýyor...");
        this.hiz=10;
    }
}
