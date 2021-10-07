package OopsPractices.MethodsAssignment;
   public class Degree{
    void getDegree(){
        System.out.println("I got degree");
    }
}
     class UnderGraduate{
      void getDegree(){
     System.out.println("I am an undergraduate");
     }
    }
     class PostGraduate{
         void getDegree(){
             System.out.println("I am an postgraduate");
         }

     
    public static void main(String[] args) {
        Degree degreeobj = new Degree();
        degreeobj.getDegree();
        UnderGraduate underObj = new UnderGraduate();
        underObj.getDegree();
        PostGraduate postObj = new PostGraduate();
        postObj.getDegree();

    }
}