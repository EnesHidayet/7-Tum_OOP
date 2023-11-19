public class YukTreni extends YukTasiyanlar implements IYuk{
    String trenTuru;

    public YukTreni(String kullanimTuru, String yolcuKapasitesi, int uretimYili, int hiz, double yukKapasitesi,String trenTuru) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili, hiz, yukKapasitesi);
        this.trenTuru=trenTuru;
    }

    public String getTrenTuru() {
        return trenTuru;
    }

    public void setTrenTuru(String trenTuru) {
        this.trenTuru = trenTuru;
    }

    @Override
    public String toString() {
        return "YukTreni{" +
                "trenTuru='" + trenTuru + '\'' +
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
        System.out.println("Trene yükleme yapýlýyor...");
    }

    @Override
    public void yukBosalt() {
        System.out.println("Trenden yükler indiriliyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Tren hýzlanýyor...");
        this.hiz+=25;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Tren hýzlanýyor...");
        this.hiz-=20;
    }
}
