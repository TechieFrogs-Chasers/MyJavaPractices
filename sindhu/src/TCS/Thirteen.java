package sindhu.src.TCS;

public class Thirteen {

    public static void main(String[] args) {
       /* int  a,b = 0;
		System.out.println("Series :");
		for(int i = 1 ; i < 8 ; i++)
		{
			a = 7 * b;
			System.out.print(a+"	"+(a-b)+"	");
			b++;
		}
			a = 7 * b;
			System.out.println(a);
			System.out.print("15th element of the series is = "+a);
	}
    }*/


	int  a = 0; 
	int b=1;
	System.out.println("Series :");
	for(int i = 1 ; i < 30 ; i++)
	{
		a = a+b;
		System.out.print(a+"	"+(a-b)+"	");
		b++;
	}
		a = b* b*b;
		System.out.println(a);
		System.out.print("15th element of the series is = "+a);
}
}