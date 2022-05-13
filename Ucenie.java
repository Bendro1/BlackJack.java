package ucenie.java;

public class Ucenie {
    public static void main(String[] args) {
        System.out.println("Dlzka  retazca obj1 je: "+Ucenie1.obj1.length());
        System.out.println("8. znak v druhom retazci je "+Ucenie1.obj2.charAt(8));
        if(Ucenie1.obj1.equals(Ucenie1.obj2)){
            System.out.println("Obj1 == Obj2");
        }
        else{
            System.out.println("Obj1 != Obj2");
        }
        if(Ucenie1.obj1.equals(Ucenie1.obj3)){
            System.out.println("Obj1 == Obj3");
        }
        else{
            System.out.println("Obj1 != Obj3");
        }
    }
}
