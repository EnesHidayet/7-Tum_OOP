public class Otomobil extends YolcuTasiyanlar implements IYolcu{
    int maxHiz;

    public Otomobil(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi,int maxHiz) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili, hiz, koltukSayisi);
        this.maxHiz=maxHiz;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "maxHiz=" + maxHiz +
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
        System.out.println("Otomobile yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("Otomobilden yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Otomobil hýzlanýyor...");
        this.hiz+=20;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Otomobil yavaþlýyor...");
        this.hiz-=20;
    }
}
