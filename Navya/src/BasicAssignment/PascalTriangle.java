    package BasicAssignment;

    import java.util.Scanner;

    public class PascalTriangle {
        public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
            int rows;
            do{
                System.out.println("Enter number of rows:");
                while(!myScannerObj.hasNextInt()){
                    System.out.println("This is not a Number.Please enter positive Number:");
                    myScannerObj.next();
                }
                rows = myScannerObj.nextInt();
            }while(rows <= 0);
                int number=1;  
            for(int i = 0; i < rows; i++) {  
                for(int space = i; space < rows ; ++space) {  
                    System.out.print("  ");  
                }  
    
                for(int j = 0; j <= i; j++) {  
                    if (j == 0 || i == 0)  
                        number = 1;  
                    else  
                         number= number* (i - j + 1) / j;  
    
                    System.out.print(" "+number+"  " );  
                }  
                  System.out.println();  
            }     
         }
   }
