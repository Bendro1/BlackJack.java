package ucenie.java;

public enum Jablko {
    Jonathan, GoldenDel,RedDel,Winesap,Cortland
}
class EnumDemo{


    public static void main(String[] args) {
        Jablko ap,ap1,ap2;
        System.out.println("Vsetky jablka a ich ordinalne hodnoty");
        for(Jablko a :Jablko.values()){
            System.out.println(a+" "+a.ordinal());
        }
        ap=Jablko.GoldenDel;
        ap1=Jablko.Jonathan;
        ap2=Jablko.GoldenDel;
        if(ap.compareTo(ap1)<0){
            System.out.println(ap+ " je pred "+ap1);
        }
        if(ap.compareTo(ap1)>0){
            System.out.println(ap1+" je pred "+ap);
        }
        if(ap.compareTo(ap2)==0){
            System.out.println(ap+" je rovnake ako "+ap2);
        }
        if(ap.equals(ap2)){
            System.out.println(ap+" je rovnake ako "+ap2);
        }
    }
}
