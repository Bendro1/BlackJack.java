package ucenie.java;

public class Throww {
    static void throwone()throws NullPointerException{
        try {
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e){
            System.out.println("Prve zachytenie "+e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            throwone();
        }
        catch (NullPointerException e){
            System.out.println("Druhe zachytenie "+e);
        }
    }
}
