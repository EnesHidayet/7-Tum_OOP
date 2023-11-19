public class Kamyon extends YukTasiyanlar implements IYuk{
    double dorseUzunlugu;

    public Kamyon(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, double yukKapasitesi,double dorseUzunlugu) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili, hiz, yukKapasitesi);
        this.dorseUzunlugu=dorseUzunlugu;
    }


    public double getDorseUzunlugu() {
        return dorseUzunlugu;
    }

    public void setDorseUzunlugu(double dorseUzunlugu) {
        this.dorseUzunlugu = dorseUzunlugu;
    }

    @Override
    public String toString() {
        return "Kamyon{" +
                "dorseUzunlugu=" + dorseUzunlugu +
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
        System.out.println("Kamyona y�kleme yap�yor...");
    }

    @Override
    public void yukBosalt() {
        System.out.println("Kamyondan y�kler indiriliyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Kamyon h�zlan�yor...");
        this.hiz+=5;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Kamyon yava�l�yor");
        this.hiz-=5;
    }
}
