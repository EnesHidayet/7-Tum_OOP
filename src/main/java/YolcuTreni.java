public class YolcuTreni extends YolcuTasiyanlar implements IYolcu{
    int vagonSayisi;
    public YolcuTreni(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi,int vagonSayisi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz, koltukSayisi);
        this.vagonSayisi=vagonSayisi;
    }

    public int getVagonSayisi() {
        return vagonSayisi;
    }

    public void setVagonSayisi(int vagonSayisi) {
        this.vagonSayisi = vagonSayisi;
    }

    @Override
    public String toString() {
        return "YolcuTreni{" +
                "vagonSayisi=" + vagonSayisi +
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
        System.out.println("Trene yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Trenden yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Tren hýzlanýyor...");
        this.hiz+=15;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Tren hýzlanýyor...");
        this.hiz-=15;
    }
}
