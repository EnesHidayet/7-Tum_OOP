public class YolcuTasiyanlar extends Araclar implements IYolcu{
    int koltukSayisi;
    public YolcuTasiyanlar(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz);
        this.koltukSayisi=koltukSayisi;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    @Override
    public String toString() {
        return "YolcuTasiyanlar{" +
                "koltukSayisi=" + koltukSayisi +
                ", id=" + id +
                ", hiz=" + hiz +
                ", kullanimTuru='" + kullanimTuru + '\'' +
                ", yolcuKapasitesi='" + yolcuKapasitesi + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    @Override
    public void yolcuBindir() {
        System.out.println("Yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Yolcu iniyor...");
    }
}
