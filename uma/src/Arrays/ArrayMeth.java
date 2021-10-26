public class ArrayMeth {
    public static void main(String[] args) {

        int[] num ={20,30,40};
        int[] marks ={60,70,80,90};

        System.out.println(num.equals(marks)); //false ,because two different objects
        

        num=marks;
        System.out.println(num.equals(marks)); //true ,even when number of elements is not same
        
        /*System.out.println(num[1]); //prints 30

        num[1]=marks[1];
        System.out.println(num[1]); // prints 70*/

       
    }
    
}
