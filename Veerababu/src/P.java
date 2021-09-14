public class P {
    public static void main(String[] args) {
       /* int i=1;
        while(i<=5){
            i++;
            System.out.println(i);
            
        }*/
        int i =1;

        /*do{
            i++;
            System.out.println("Hi");
            
            
        }while(i<=5);*/

//For Loop
       loop1: for(int a=1; a<=5;a++){
            System.out.println("Hi");
            if(a==3){
                System.out.println("a is 3");
            }
           loop2: for(int b=1;b<=5;b++){
            System.out.print("* ");
            break ;
            
        }
        System.out.println();
     }
    }
}