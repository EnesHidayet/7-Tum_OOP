public class YukGemisi extends YukTasiyanlar implements IYuk{
    int konteynirKapasitesi;
    public YukGemisi(String kullanimTuru, String yolcuKapasitesi, int uretimYili,int hiz, double yukKapasitesi,int konteynirKapasitesi) {
        super(kullanimTuru, yolcuKapasitesi, uretimYili, hiz, yukKapasitesi);
        this.konteynirKapasitesi=konteynirKapasitesi;
    }

    public int getKonteynirKapasitesi() {
        return konteynirKapasitesi;
    }

    public void setKonteynirKapasitesi(int konteynirKapasitesi) {
        this.konteynirKapasitesi = konteynirKapasitesi;
    }

    @Override
    public String toString() {
        return "YukGemisi{" +
                "konteynirKapasitesi=" + konteynirKapasitesi +
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
        System.out.println("Gemiye y�kleme yap�l�yor...");
    }

    @Override
    public void yukBosalt() {
        System.out.println("Gemiden y�kler indiriliyor...");
    }

    @Override
    public void aracHizlan() {
        System.out.println("Gemi h�zlan�yor...");
        this.hiz+=5;
    }

    @Override
    public void aracYavasla() {
        System.out.println("Gemi yava�l�yor...");
        this.hiz-=5;
    }
}
