package ucenie.java;




public class Vypocet {
    static class Vnejsi {
        static int outerx = 100;

       static  void test() {
            for (int i = 0; i < 10; i++) {
                class Vnitrni {
                    void display() {
                        System.out.println("Hodnota outerx je: " + Vnejsi.outerx);

                    }
                }
               Vnitrni inner = new Vnitrni();
                inner.display();
            }


        }


        public static void main(String[] args) {
           Vnejsi outer=new Vnejsi();
           outer.test();
        }

    }


}
