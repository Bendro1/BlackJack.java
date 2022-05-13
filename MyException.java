package ucenie.java;

public class MyException extends Exception {
     int a;
       void Exception(int b )throws MyException{
           a=b;
           throw new MyException();


    }
    static void ExceptionDemo(int b)  {
        if(b>10){
            System.out.println("Normalne ukoncenie programu");
        }
    }

    public static void main(String[] args) {
       ExceptionDemo(11);
       ExceptionDemo(1);

    }
}
