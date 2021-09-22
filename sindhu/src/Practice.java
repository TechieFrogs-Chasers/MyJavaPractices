public class Practice {
    public static void main(String[] args) {
       /* int n=6;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){                //square pattern
                System.out.print("& ");
            }
            System.out.println(" ");

        }*/
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){               //increased triangle pattern
                System.out.print("& ");
            }
            System.out.println(" ");

        }*/

        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){                //decreased triangle pattern
                System.out.print("& ");
            }
            System.out.println(" ");

        }*/

        /*int n=5;
        for(int i=1;i<=n;i++){
            //for(int j=6;j>=i;j--){  
                for(int j=i;j<=n;j++){              //right hand triangle
                System.out.print("  ");
            }
            
            //for(int j=1;j<=n;j++){
                for(int k=1;k<=i;k++){               //increased triangle pattern
                    System.out.print("* ");
                }
               
                System.out.println(" ");
             }*/

         int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){               //increased triangle pattern
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){                //decreased triangle pattern
                System.out.print("& ");
            }
            System.out.println( );
             }


    
}
}
