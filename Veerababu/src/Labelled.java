public class Labelled {
    public static void main(String[] args) {
        
        
        
        loop1: for(int i=1;i<=4; i++ ){
            System.out.println(i);
           loop2: for(int j=2; j<=5; j++){
                System.out.println("Hi");
            }
            loop3: for(int a=3; a>=2;a++){
                System.out.println(a++);
                System.out.println(a);
                break;
            }
        }
    }
    

}
