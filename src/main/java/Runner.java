public class Runner {
    public static void main(String[] args) {
        YukTasiyanlar kamyon=new Kamyon("Karayolu","3",2005,45,1250,4.25);
        kamyon.aracHizlan();
        System.out.println(kamyon.hiz);
        kamyon.aracYavasla();
        System.out.println(kamyon.hiz);
        kamyon.yukBosalt();
        kamyon.yuklemeYap();

        YolcuTasiyanlar ucak=new YolcuUcagi("Havayolu","120",2018,500,120,4);
        ucak.yolcuBindir();
        ucak.yolcuIndir();
        ucak.aracHizlan();
        System.out.println(ucak.hiz);
        ucak.aracYavasla();
        System.out.println(ucak.hiz);
    }
}
