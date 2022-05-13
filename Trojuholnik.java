package ucenie.java;

public class Trojuholnik extends Utvar{
    Trojuholnik(double a ,double b){
        super (a,b);
    }
    double plocha(){
        System.out.println("Plocha trojuholnika je : ");
        return dim1*dim2;
    }
}
