public interface Interfacestatic {

    static void InterMeth(){
        System.out.println("static method ");
    }
    
}
 class Interfacestatic2 implements Interfacestatic{
    public static void main(String...args){
        Interfacestatic.InterMeth();
    }
}