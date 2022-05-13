package ucenie.java;

public class C implements B{


    public void math1() {
        System.out.println("Implementacia math1");
    }

    public void math2() {
        System.out.println("Implementacia math2");
    }

    public void math3() {
        System.out.println("Implementacia math3");
    }

    public static void main(String[] args) {
        C c =new C();
        c.math1();
        c.math2();
        c.math3();
    }
}
