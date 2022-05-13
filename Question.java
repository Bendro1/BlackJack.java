package ucenie.java;

import java.util.Random;

public class Question extends SharedConstants {
    Random r =new Random();
    int askme(){
    int prob=(int )(100*r.nextDouble());
    if(prob<30){
        return nie;
    }
    else if(prob<60){
        return ano;
    }
    else if(prob<75){
        return mozno;
    }
    else if(prob<90){
        return skoro;
    }
    else
        return nikdy;
    }
}
