public class TypeCasting {
    public static void main(String[] args) {
    char ch='M';
    int i=ch;//widening converts small datatype to bigger datatype 
    long l=i;//it automatically converts or implcity casting 
    float f=l;
    double d=f;
    System.out.println("given char value is :"+ d);
    }
}
