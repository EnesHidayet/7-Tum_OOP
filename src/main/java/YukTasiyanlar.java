public class YukTasiyanlar extends Araclar implements IYuk{
    double yukKapasitesi;


    public YukTasiyanlar(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, double yukKapasitesi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili, hiz);
        this.yukKapasitesi=yukKapasitesi;
    }

    public double getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(double yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    public String toString() {
        return "YukTasiyanlar{" +
                "yukKapasitesi=" + yukKapasitesi +
                ", id=" + id +
                ", hiz=" + hiz +
                ", kullanimTuru='" + kullanimTuru + '\'' +
                ", yolcuKapasitesi='" + yolcuKapasitesi + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    @Override
    public void yuklemeYap() {
        System.out.println("Yükleme yapýlýyor...");
    }

    @Override
    public void yukBosalt() {
        System.out.println("Yük indiriliyor...");
    }
}
