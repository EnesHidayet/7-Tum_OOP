public class YolcuGemisi extends YolcuTasiyanlar {
    int katSayisi;
    public YolcuGemisi(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi,int katSayisi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz, koltukSayisi);
        this.katSayisi=katSayisi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    @Override
    public String toString() {
        return "YolcuGemisi{" +
                "katSayisi=" + katSayisi +
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
        System.out.println("Gemiye yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Gemiden yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Gemi hýzlanýyor...");
        this.hiz+=5;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Gemi yavaþlýyor...");
        this.hiz-=5;
    }
}
