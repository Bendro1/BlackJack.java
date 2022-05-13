package ucenie.java;




public class Pretypovanie {
static void vatest(int...v){
    System.out.println(v.length+" obsah: ");
    for(int x:v){
        System.out.print(x);
        System.out.println();
    }
}
static void vatest(String msg,int...v){
    System.out.println(msg+v.length+" obsah: ");
    for(int x:v){
        System.out.print(x);
        System.out.println();
    }
}
static void vatest(boolean...v){
    System.out.println(v.length+" obsah: " );
    for(boolean x:v){
        System.out.print(x);
        System.out.println();
    }
}

    public static void main(String[] args) {
        vatest(15,16,17,18,25);
        vatest(true,true,false,true);
        vatest("toto je sprava vatest",15,16,25,33,63);
    }
    }





