public class YolcuUcagi extends YolcuTasiyanlar implements IYolcu{
    int motorSayisi;
    public YolcuUcagi(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, int koltukSayisi,int motorSayisi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili,hiz , koltukSayisi);
        this.motorSayisi=motorSayisi;
    }

    public int getMotorSayisi() {
        return motorSayisi;
    }

    public void setMotorSayisi(int motorSayisi) {
        this.motorSayisi = motorSayisi;
    }

    @Override
    public String toString() {
        return "YolcuUcagi{" +
                "motorSayisi=" + motorSayisi +
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
        System.out.println("U�a�a yolcu biniyor...");
    }

    @Override
    public void yolcuIndir() {
        System.out.println("U�aktan yolcu iniyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("U�ak h�zlan�yor...");
        this.hiz+=50;
    }

    @Override
    public void aracYavasla() {
        System.out.println("U�ak h�zlan�yor...");
        this.hiz+=50;
    }
}
