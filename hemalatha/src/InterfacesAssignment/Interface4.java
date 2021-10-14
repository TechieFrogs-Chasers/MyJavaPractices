package InterfacesAssignment;

interface Assign4 {
    int k=10;
    String name="hema";
    static final int n=20;
}
    class StaticFinal implements Assign4{
        public static void main(String[] args) {
            //StaticFinal st = new StaticFinal();
            System.out.println(k);
            System.out.println(name);
            System.out.println(n);
        }
    }
    
//final variables cannot be changed
// fields in an interface are public,static,and final implicitly
//in interfaces variables are implicitly called by static because there is no instantiation.
