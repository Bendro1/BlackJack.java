package ucenie.java;

import static java.lang.Math.*;

public class StatickyImport {
    static double strana1,strana2;
   static double predpona;

    public static void main(String[] args) {
        strana1=3.0;
        strana2=4.0;
        predpona=sqrt(strana1+strana2)+pow(strana1,strana2);
        System.out.println(predpona);
    }




}
