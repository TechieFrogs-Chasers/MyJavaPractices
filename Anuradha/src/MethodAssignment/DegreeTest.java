package MethodAssignment;
class Degree{

    public void getDegree(){
        System.out.println("I got Degree");
    }
}
class UnderGraduate extends Degree{

    public void getDegree(){
        super.getDegree();
        System.out.println("I got UnderGraduate Degree");
    }
}

class PostGraduate extends Degree{

    public void getDegree(){
        super.getDegree();
        System.out.println("I got PostGraduate Degree");
    }

}
public class DegreeTest {

    public static void main(String[] args) {
        Degree degreeObj = new Degree();
        UnderGraduate UGObj = new UnderGraduate();
        PostGraduate postObj = new PostGraduate();

        degreeObj.getDegree();

        UGObj.getDegree();

        postObj.getDegree();
    }
    
}
