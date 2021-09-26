package sindhu.src.OOPs.Assignment;

public class ImportantPoints {
    //three types to initialize values

    //first one by giving values directly

    class Student1{
        int j =10;
        float g = 2.33f;
        static int k =10;

        //2nd one 
        public class Student {
    
            String name;
              int roll_no;
          
              public static void main(String[] args) {
                  Student x = new Student();  
                  x.name = "john";   // by after creating instance
                  x.roll_no = 2;
          
                  System.out.println(x.name);
                  System.out.println(x.roll_no);


        //3rd method by constructor

         class Student {
    
            String name;
              int roll_no;
          
              public static void main(String[] args) {
                  Student x = new Student();
                  System.out.println(x.name);
                  System.out.println(x.roll_no);
          
              }
          
              Student(){             //constructor
                  name = "john";
                  roll_no = 2;         
              }
              
              
          }
    
}
        }
    }
}
