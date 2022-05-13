package ucenie.java;

public class NewThread extends Thread{


    NewThread(){
        super("Moje vlakno");
        System.out.println("Druhe vlakno "+this);
        this.start();
    }
    public void run(){
        try{
            for(int i =5;i>0;i--){
                System.out.println("Druhe vlakno "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Pozastavenie vlaknka ");
        }
        System.out.println("Ukoncenie druheho vlakna");
    }

    public static void main(String[] args) {
        NewThread n =new NewThread();
        n.run();
        new Thread();
        try{
            for(int j =5;j>0;j--){
                System.out.println("Hlavne vlakno "+j);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e ){
            System.out.println("Pozastavenie hlavneho vlakna "+e);
        }
        System.out.println("Ukoncenie hlavneho vlakna ");
    }
}
