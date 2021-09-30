import java.util.Scanner;

/*public class Hello {
    public static void main(String[] args){
        /*System.out.println("sindhu");
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(""+10+20);
        System.out.println(10+20+" ");
        


    }
    
}*/


//break statement
/*int n =5;
for(int i=0;i<=n;i++){
    if (i==4){
    continue;
    }
    System.out.println("i");

}
    }
}*/

//compoundinterest

/*public class PracticePrg{
    int p;
   
    public static void main(String[] args) {
        
        //A = (p(1+r/100))pow n;
       

        Scanner input = new Scanner(System.in);
        System.out.println(" enter p value");
        double x = input.nextDouble();
        System.out.println(" enter r value");
        double y = input.nextDouble();
        System.out.println(" enter n value");
        double z = input.nextDouble();
    

       PracticePrg a = new PracticePrg();

        
        a.A(1400000,9.5,7);
        
        
}
    PracticePrg(){
        System.out.println("default constructor");
    }
    void A(int p , double r , int n){
       double A = p*(Math.pow((1+r/100),n));
      double  CI = A-p;
       
       System.out.println("area of rectangle" + CI);
    }
}*/


//cube of a number

/*public class PracticePrg{
    
    public static void main(String[] args) {
        int a;

        PracticePrg input = new PracticePrg();
        PracticePrg.cube(3.0);  // given static in signature so, accessing in static way by using class name

    }

    static  void cube(double a ){
    
     double cube = a*a*a;
        System.out.println("cube of a number" + cube);

    }

    PracticePrg(){
        System.out.println("default constructor");
    }


}*/

//cube of a number using scanner
/*public class PracticePrg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int x = input.nextInt();

        int cube = x*x*x;
        System.out.println("cube of a number"+ cube);
        
    }
}*/

//quotient and remainder using methods
/*public class PracticePrg{
    public static void main(String[] args) {
        PracticePrg x = new PracticePrg();
        x.find(4,2);
        x.remainder(6,3);
    }

    void find(int a, int b){
       int find = a/b;
       System.out.println("quotient " + find );
}
void remainder(int c, float d){
    
    float remainder = c%d;
    System.out.println("out of number"+ remainder);
}
}*/

//swapping two numbers
/*public class PracticePrg{
    public static void main(String[] args) {
        int a,b,t;
        a=4;
        b=5;
        t=a;
        a=b;
        b=t;

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);
        
    }
}*/

//swapping two numbers using methods

/*public class PracticePrg{
    int t;
    public static void main(String[] args) {
        PracticePrg x = new PracticePrg();
        x.swappingTwoNumbers(2,3);

    }

    void swappingTwoNumbers(int a , int b){
        t=a;
        a=b;
        b=t;

        System.out.println("after swapping"+" "+ a + " " + b + " " + t);


    }
}*/

//number is even or odd

/*public class PracticePrg{
    public static void main(String[] args) {
        int x=5;
        if(x%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}*/

//number is even or odd using methods
/*public class PracticePrg{
    public static void main(String[] args) {
        PracticePrg y = new PracticePrg();
        PracticePrg.evenOrOdd(6);


        
    }

   static void evenOrOdd(int x){
        if(x%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

    }*/


//even or odd by using constructors

/*public class PracticePrg{
    
    
    public static void main(String[] args) {
        PracticePrg x = new PracticePrg("sindhu");
    
        x.evenOrOdd(5);

    }

    PracticePrg(String name){      //printing two constructors at a time by using this keyword
        this(4);
        System.out.println("default constructor");
    }

    PracticePrg(int y){
        System.out.println("first constructor");

    }

     void evenOrOdd(int x){
        if(x%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

}
}*/

//alphabet is vowel or consonant

/*public class PracticePrg{

    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);
    System.out.println("enter x value");
    char x = input.next().charAt(0);
    switch (x){
        case 'a':
       
        case 'e':
        
        case 'i':
        
        case 'o':
        
        case 'u':
        
        case 'A':
        
        case 'E':
        
        case 'I':
        
        case 'O':
        
        case 'U':
        System.out.println( x +  "is vowel");
        break;
        default:
        System.out.println(x + " isconsonant");


    }
}
}*/

//vowelor consonant using method

/*public class PracticePrg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = input.next().charAt(0);
        PracticePrg x = new PracticePrg();
        x.display(ch);

    }

    void display(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'){
            System.out.println(ch+ " is a vowel");
        }
        else if ((ch>='a'&& ch<='z') || (ch>='A'|| ch<='Z')){
            System.out.println(ch+ "is a consonant");
        }
        else {
            System.out.println("not an alphabet");
        }
    }
}*/

//largest among three numbers
/*public class PracticePrg{
    public static void main(String[] args) {
        PracticePrg s = new PracticePrg();
        PracticePrg.display(2,3,4);



    }
    static void display(int x , int y, int z){
        if ((x>y) && (x>z))
        {
            System.out.println("x is larger");
        }
        else if ((y>z)&&(y>x))
        {
            System.out.println("y is larger");

        }
        else {
            System.out.println("z is larger");
        }
        

    }
}*/

//largest among three numbers using ternary operator
/*public class PracticePrg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        System.out.println("enter third number");
        int z = input.nextInt();
        int s = x>y?x:y;
        int t = z>s?z:s;
        System.out.println("largest number" +t);
}
}*/

//character is alphabet or not
/*public class PracticePrg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an alphabet");
        char in = input.next().charAt(0);
        PracticePrg x = new PracticePrg();
        //x.display('y');
        x.display(in);
    }
    void display(char ch){

        if((ch>='a')&&(ch<='z') || (ch>='A')&&(ch<='Z')){
            System.out.println(ch+ "is an alphabet");
        }
        else {
            System.out.println(ch+ "is not an alphabet");

        }

    }*/

    //factorial of a number
    /*public class PracticePrg{
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int n = input.nextInt();

        PracticePrg x = new PracticePrg();
        x.display(n);


    }

void display(int n){
     int fact =1;
            for(int i=1; i<=n; i++){
                fact = fact*i;
            }
            System.out.println("factorial of number" +fact);

}
    }*/

    //swapping two numbers using methods

/*public class PracticePrg{
    int t;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a value");
        int p = input.nextInt();
        System.out.println("enter b value");
        int r = input.nextInt();

        PracticePrg x = new PracticePrg();
        x.swappingTwoNumbers(p,r);

    }

    void swappingTwoNumbers(int a , int b){
        t=a;
        a=b;
        b=t;

        System.out.println("after swapping"+" "+ a + " " + b + " " + t);


    }
}*/

//sum of naturalnumbers
/*public class PracticePrg{
    
    public static void main(String[] args) {
        int n=6 , sum=0;
        for(int i=0;i<=n;i++){
            sum =sum+i;
        }
            System.out.println("sum of natural numbers" + sum);


        }
    }
*/
    //sum of natural numbers by using methods
    /*public class PracticePrg{
        int n;
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter a number");
            int n = input.nextInt();

            PracticePrg x = new PracticePrg();

            x.find(6);
        }

        void find(int x ){
            
            int n, sum=0;
        for(int i=0;i<=6;i++){
            sum =sum+i;
        }
            System.out.println("sum of natural numbers" + sum);


        }

        }*/


        //multiplication table using for loop
        public class PracticePrg{
            public static void main(String[] args) {
                int i,n=10;
                for(i=1;i<=n;i++){
                    System.out.printf("%d * %d = %d \n ", n , i,  n*i);

            }
        }
    }

    
    












