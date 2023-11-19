import java.util.Random;
import java.util.UUID;

public abstract class Araclar {
    UUID id=UUID.randomUUID();
    int hiz;
    String kullanimTuru;
    String yolcuKapasitesi;
    int uretimYili;

    public Araclar(String kullanimTuru, String yolcuKapasitesi, int uretimYili, int hiz) {
        this.kullanimTuru = kullanimTuru;
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.uretimYili = uretimYili;
        this.hiz=hiz;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getKullanimTuru() {
        return kullanimTuru;
    }

    public void setKullanimTuru(String kullanimAmaci) {
        this.kullanimTuru = kullanimAmaci;
    }

    public String getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(String yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Araclar{" +
                "id=" + id +
                ", hiz=" + hiz +
                ", kullanimTuru='" + kullanimTuru + '\'' +
                ", yolcuKapasitesi='" + yolcuKapasitesi + '\'' +
                ", uretimYili=" + uretimYili +
                '}';
    }

    public void aracHizlan(){
        System.out.println("Araç hýzlanýyor.");
    }

    public void aracYavasla(){
        System.out.println("Araç yavaþlýyor.");
    }

}
