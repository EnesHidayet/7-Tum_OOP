public class KargoUcagi extends YukTasiyanlar implements IYuk{
    int yuklemeAgziGenisligi;
    public KargoUcagi(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, double yukKapasitesi,int yuklemeAgziGenisligi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz, yukKapasitesi);
        this.yuklemeAgziGenisligi=yuklemeAgziGenisligi;
    }

    public int getYuklemeAgziGenisligi() {
        return yuklemeAgziGenisligi;
    }

    public void setYuklemeAgziGenisligi(int yuklemeAgziGenisligi) {
        this.yuklemeAgziGenisligi = yuklemeAgziGenisligi;
    }

    @Override
    public String toString() {
        return "KargoUcagi{" +
                "yuklemeAgziGenisligi=" + yuklemeAgziGenisligi +
                ", yukKapasitesi=" + yukKapasitesi +
                ", id=" + id +
                ", hiz=" + hiz +
                ", kullanimTuru='" + kullanimTuru + '\'' +
                ", yolcuKapasitesi='" + yolcuKapasitesi + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    @Override
    public void yuklemeYap() {
        System.out.println("Uçaða yükleme yapýlýyor...");
    }

    @Override
    public void yukBosalt() {
        System.out.println("Uçaktan yük indiriliyor...");;
    }

    @Override
    public void aracHizlan() {
        System.out.println("Uçak hýzlanýyor...");
        this.hiz+=50;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Uçak yavaþlýyor...");
        this.hiz-=35;
    }
}
