package sindhu.src;

/*public class EncapsNew {
    private int id;
    private String name;
    private int Roll_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return this.Roll_no;
    }

    public void setRoll_no(int Roll_no) {
        this.Roll_no = Roll_no;
    }
    void Test(){
        System.out.println("method");

    
}

class Student3{

    
    }
    public static void main(String[] args) {
        EncapsNew x = new EncapsNew();
        x.setId(245);
        x.setName("sindhu");
        x.setRoll_no(24);
        System.out.println("student1 id :" +" "+ x.getId()+" "+ " student2 name :" + " "+ x.getName());
        System.out.println(x.getRoll_no());
        x.Test();
        


        
    }

    
}*/

public class EncapsNew{
   private int a=5;
    private int b=8;
   private int sum = a+b;

   public int geta(){
       return a;
   }

   public int getb(){
       return b;
   }

   public void setB(int newb){
       b = newb;
   }
   public int getsum(){
    return sum;
}

public void setSum(int newsum){
    sum = newsum;
}


}

   class College{


    public static void main(String[] args) {

        EncapsNew x = new EncapsNew();
        x.setB(10);
        
        System.out.println(x.getb());
        System.out.println(x.getsum());
        



        
    }
}



   