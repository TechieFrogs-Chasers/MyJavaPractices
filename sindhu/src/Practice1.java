import java.util.Scanner;

public class Practice1 {
    //public static <string> void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
       
        System.out.println("Add two integers " + c);
        input.close();*/


    /*alphabet or not

        Scanner input = new Scanner(System.in);
        System.out.println("enter alphabet");
        char x = input.next().charAt(0);
        if((x>='A')&& (x <= 'Z')||(x>='a')&&(x<='z')){
            System.out.println("is an alphabet");
        } 
        else 
        {
            System.out.println("not an alphabet");
        }
        input.close();
    }
}*/

//armstrong number

/*Scanner input = new Scanner(System.in);
System.out.println("enter a number");
//153 = 1*1*1 + 5*5*5 + 3*3*3
int temp = input.nextInt();




int r,sum=0,num;
num = temp;
while(temp>0)
r = temp%10;
temp = temp/10;
sum = sum + (r*r*r);
if(num==sum){
    System.out.println("armstrong number");
}
else 
{
    System.out.println(" not an armstrong number");
}
input.close();
    }
}*/

//display characters from a to z
/*Scanner input = new Scanner(System.in);
System.out.println("enter a character");
char x = input.next().charAt(0);
char z;
for ( char i=x;i<=z;i++){
    System.out.println(i+ " ");
    input.close();
}
    }
}
*/

//even or odd
/*Scanner input = new Scanner(System.in);
System.out.println("enter a number");
int x = input.nextInt();
if(x%2==0)
{ 
    System.out.println("even");  //ifelse
}
else 
{
    
System.out.println("odd");
}

String min = (x%2==0)?  "even" : "odd";     //ternery operator
System.out.println(min);
Scanner input;
input.close();
    }

}*/


//factorial
/*Scanner input = new Scanner(System.in);
System.out.println("enter a number");
int x = input.nextInt();
for(int i=1;i<=x;i++){
    System.out.println(i);
}
    }
}*/

private static final 
Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number");
        int n = scanner.nextInt();
         
        
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n % 2 != 0)
        {
            System.out.println("weird");
        }
        else if (n>=2 && n<=5)
        {
            System.out.println("not weird");
        }
        else if(n>=6 && n<=20)
        {
            System.out.println("weird");
        }
        else if (n>20)
        {
            System.out.println("not weird");

        }
        
      
        
    }
}




