package ucenie.java;

public class KrabicaHmotnost extends Krabica{
    double hmotnost;

    KrabicaHmotnost(double v,double s ,double h,double hm){
        super(v, s, h);
        hmotnost=hm;
    }
    KrabicaHmotnost(double len){
        super(len);
        hmotnost=len;
    }

    public static void main(String[] args) {
        KrabicaHmotnost krabica=new KrabicaHmotnost(10,15,25,36);
        Krabica krabica1=new Krabica(10,20,30);
        Krabica krabica2=new Krabica(10);
        KrabicaHmotnost krabica3=new KrabicaHmotnost(10);
        Krabica krabica4=new Krabica();
        System.out.println("Objem prvej krabice je "+krabica.objem());
        System.out.println("Hmotnost prvej krabice je "+krabica.hmotnost);
        System.out.println("Objem druhej krabice je "+krabica1.objem());
        System.out.println("Objem tretej krabice je "+krabica2.objem());
        System.out.println("Objem stvrej krabice je "+krabica3.objem());
        System.out.println("Hmotnost stvrtej krabice je "+krabica3.hmotnost);
        System.out.println("Objem piatej krabice je "+krabica4.objem());

    }
}
