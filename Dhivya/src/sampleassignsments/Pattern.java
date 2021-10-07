public class Pattern {
    public static void main(String[] args) {
/*output: 111
          22
          3     */
       for(int i =1;i<=3;i++)
        {
            for(int j=3;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
/*output: 1
          12
          123   */
        }
        for(int a =1;a<=3;a++){
            for(int b= 1;b<=a;b++){
                System.out.print(b);
            }
            System.out.println();
        }
 /*output: 333
           22
           1      */
        for(int a=3;a>=1;a--){
            for(int b= 1;b<=a;b++){
                System.out.print(a);
            }
            System.out.println();
        }
/*output: 3
          22
          111    */

        for(int a=3;a>=1;a--){              
            for(int b=3;b>=a;b--){
                System.out.print(a);
            }
            System.out.println();
        }
/*output: 321
          32
          3     */
        for(int a=1;a<=3;a++){          
            for(int b=1;b<a;b++){       
                System.out.print(" ");      
            }
            for(int c=3;c>=a;c--){
                System.out.print("*");
            }
            System.out.println(); 
        }  
/*output:   *
           **
          ***    */
        for(int a=1;a<=3;a++){          
            for(int b=2;b>=a;b--){       
                System.out.print(" ");      
            }
            for(int c=1;c<=a;c++){
                System.out.print("*");
            }
            System.out.println();
    }  
 }

}
