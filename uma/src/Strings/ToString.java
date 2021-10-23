public class ToString {

    int id;
    String name;
   static String place= "ofallon";

    ToString(int i,String s){
        this.id=i;
        this.name=s;
    }
   
    public  String toString() {
        return id+" "+name;
        
    }

    public static void main(String[] args) {

        ToString s1 = new ToString(10, "uma");
        ToString s2 = new ToString(20, "ram");
        System.out.println(s1);
        System.out.println(s2);
        s1=s2;  //storing s2 into s1 , so s1 is same as s2
        System.out.println(s1); //prints s2
        System.out.println(s2);// prints s2
        System.out.println(place.toString());
        
    }
}
