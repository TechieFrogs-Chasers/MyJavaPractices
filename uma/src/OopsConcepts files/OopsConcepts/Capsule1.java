package OopsConcepts;


public class Capsule1{
  
     int num;
     static int stat;
     private String name;
     private int empid;
     final int access =25;   // only get, no setter for final int will be generated


     public static void main(String[] args) {
         Capsule1 capobj = new Capsule1();
        System.out.println( capobj.num);
         InnerCapsule incaps =capobj.new InnerCapsule();
         incaps.getemp("uma");

         capobj.setstat(9);


         if(stat==capobj.getstat()){

            Capsule1 obj = new Capsule1();
            InnerCapsule incap =obj.new InnerCapsule();
           
           System.out.println(incap.turnover);
        }
          else
           System.out.println(" access not granted");
           


     }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        n = name;
    }
    public int getempid(){
        return empid;
    }
    public void setempid(int j){
       j=empid;

    }

    public int getAccess() {
        return this.access;
    }

    public int getstat(){
        return stat;
    }
    public void setstat(int s){
        s=stat;
    }
    
        class InnerCapsule{

         private String emp="uma";
          private int id=10;
         int turnover = 100000;

            public String getemp(String s){
             s=emp;
             return emp;
            }
            public int getid(int i){
             i=id;
             return id;
            }   
        }
    
    
}

 class Capsule2{
        static String compName = "varsha llc";
        int taxId; 


    public int gettaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }
    
    
    public static void main(String[] args) {
       Capsule1 capobj = new Capsule1();
       capobj.setName("umaram");
       capobj.setempid(40);
       System.out.println(capobj.getName());
      System.out.println(Capsule1.stat);
      System.out.println(capobj.access);
      System.out.println(Capsule2.compName);
    
     /* InnerCapsule incap =capobj.new InnerCapsule();
        incap.getemp();
       

      if(empid==9){

        Capsule1 obj = new Capsule1();
        InnerCapsule incap =obj.new InnerCapsule();
        incap.getemp();
       
       System.out.println(incap.turnover);
    }
      else
       System.out.println("access not granted");*/
       
       
    
}     
 }
    
