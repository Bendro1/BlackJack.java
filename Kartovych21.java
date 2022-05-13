package ucenie.java;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Kartovych21 {
    static Random rand;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int volba;
        int kartyJa=0;
        int kartyPc=0;
        for(int i =0;i==kartyJa;i++){
            kartyJa=rand.nextInt(11);
            System.out.println("Tvoj sucet kariet je "+kartyJa+" chces dalsiu kartu ? 1-ano 2-nie ");
            volba=Integer.parseInt(br.readLine());
            if(volba==1){
                kartyJa+= rand.nextInt(11);
            }

        }

    }
}
