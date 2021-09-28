package OopsConcepts;

//import OopsConcepts.OuterClasses2.OuterClass.InnerClass;

public class OuterClasses2 {
         int a;
         String s;
         static int si;
         private String name;

        void displayouter(){
          
           // InnerClass inobj = new InnerClass();    //  trying to create static class instance
           // inobj.Innermethod(10, "ram");
            

             System.out.println(" most outer"); 
      
        }

        void callInner(){
 
            OuterClass1 out1 = new OuterClass1();
            out1.subdisplay();   //can access private method of immediate inner class
        }
        public static void main(String[] args) {
            
            OuterClasses2 outerobj = new OuterClasses2();
            System.out.println(si + outerobj.name);


            
        }

    public class OuterClass1{    // creating a class inside the main class
    
        String empname;
        int b;

          private void subdisplay(){

            InnerClass inobj = new InnerClass();
            System.out.println(inobj.f);  //can access static class variables

            inobj.Innermethod(10, "john"); //static class ,non static method

            //inobj.inMethod(10); //  not applicable for arguments -----> static inner method (immediate inner )
      
            System.out.println("method in outer class"+si);
        }

    static class InnerClass{

         int num;
         float f;
         boolean bl;
         String gender;

    
         static int inMethod(){

             return 10;
         }
        
        void Innermethod(int i ,String g){
        
          DeeperClass deep = new DeeperClass();
            deep.deeperMethod(); //can access private class method into the static class

        System.out.println("inner class method"+si+deep.cha);
        }

    private class DeeperClass{
        int p;

        String cha;
        
        void deeperMethod(){
           System.out.println(si+p); 
        }

    }

    
    }

}

}