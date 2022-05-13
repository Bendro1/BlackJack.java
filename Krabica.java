package ucenie.java;

public class Krabica {
    private double vyska;
    private double sirka;
    private double hlbka;

    Krabica(double v,double s,double h){
        vyska=v;
        sirka=s;
        hlbka=h;

    }
    Krabica(double len){
        vyska=sirka=hlbka=len;
    }
    Krabica(){
        vyska=-1;
        sirka=-1;
        hlbka=-1;
    }
    double objem(){
        return vyska*sirka*hlbka;
    }
}
