package sindhu.src.Methods;

public class Seventh {
     int i = 6;

    static void printNum(int i){
        
        System.out.println("value of i" + i);
    }
}

    class Seven extends Seventh{
        int j;

       static void printNum(int j){
            System.out.println("value of j" + j);
        }

        public static void main(String[] args) {
            Seven x = new Seven();
            x.printNum(7);
            System.out.println(x.i);

            Seventh y = new Seven();
            Seventh.printNum(8);

            
}

Seven(){
    super();
}
    }
    

