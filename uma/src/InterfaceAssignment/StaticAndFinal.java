public interface StaticAndFinal {
    int a=100;
    float f=10.0f;
    static final  int p=10;
    
}

class StatFinal implements StaticAndFinal{


       public static void main(String[] args) {
        System.out.println(a);
        System.out.println(f);
    }

   
}
//In interface,variables are static because there is no instantiation 
// variables must be assigned value since there is no instance.value must not be changed i.e final