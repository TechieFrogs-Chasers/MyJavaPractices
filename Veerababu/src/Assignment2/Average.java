package Assignment2;

public class Average {
    int a;
    int b;
    int c;
    int d = (a+b+c)/3;
    public static void main(String[] args) {
    Average averageObj = new Average(4,6,4);
    System.out.println("Average of Three Numbers in Constructors"+" "+averageObj.d);
    int result = Average.AverageOfThree(5, 5, 5);
    System.out.println("Average of Three Numbers in Method"+" "+result);

        
    }

    Average(int a, int b, int c)
    {
       this.a = a;
       this.b = b;
       this.c = c;
       this.d = (a+b+c)/3;
    }

    static int AverageOfThree(int x, int y, int z)
    {
        int Average = (x+y+z)/3;
        return Average;
    }
}
