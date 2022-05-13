package ucenie.java;

public class Ask extends SharedConstants {
    static void ask(int result){
        switch(result){
            case 0:{
                System.out.println("nie");
                break;
            }
            case 1:{
                System.out.println("ano");
                break;
            }
            case 2:{
                System.out.println("mozno");
                break;
            }
            case 3:{
                System.out.println("skoro");
                break;

            }
            case 4 :{
                System.out.println("nikdy");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Question q =new Question();
        ask(q.askme());
        ask(q.askme());
        ask(q.askme());
        ask(q.askme());
        ask(q.askme());
    }
}
