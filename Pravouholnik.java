package ucenie.java;

public class Pravouholnik extends Utvar{
    Pravouholnik(double a ,double b){
        super (a,b);
    }
    double plocha(){
        System.out.println("Plocha pravouholnika je : ");
        return dim1*dim2/2;
    }

    public static void main(String[] args) {
        Trojuholnik t =new Trojuholnik(9,5);
        Pravouholnik p =new Pravouholnik(10,8);
        System.out.println("Trojuholnik : "+t.plocha());
        System.out.println("Pravouholnik : "+p.plocha());
        }
    }

