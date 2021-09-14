public class Fullpyramid {
 public static void main(String[] args)  {
     int n = 5;
       for (int i=0; i < n; i++)
        {
            for (int j = n-i; j>1; j--)
            {
                System.out.print(" ");
            }
  
            
            for (int j=0; j<=i; j++ )
            {
                System.out.print(" * ");       
               // System.out.print(i+ " "+j);
            }
  
            System.out.println();
        }
        // floyd's triangle//
        
        /*int number = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(" ");
            for(int j = 1 ; j <= i; j++){
                System.out.print(number +" ");
                ++number;
            }
            System.out.println();
        }*/
        int a=5;
       // for(int a = 1; a >= 5; a++){
         /*loop1:
           do {
            
           System.out.println("print do");
           
           a++;
           break;
           }
             while (a<=5) ;
               // if (a == 3); 
            
               // System.out.println(a);
               // a++;*/
              /* while(a<=10){
                   if (a ==7){
                       a++;
                       continue;
                   }
                   System.out.println(a);
                   a++;
               }*/
               aa:
               for(int i = 1; i <= 3; i++){
                   bb:
                   for(int j = 1; j<=3; j++){
                       if (i == 2 && j ==2 ){
                           continue bb;
                       }
                       System.out.println(i + " "+ j);
                   }
               }

             
    }
} 
