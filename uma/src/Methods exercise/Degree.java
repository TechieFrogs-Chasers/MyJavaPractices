public class Degree {
    
    void getDegree(){
        System.out.println("I got a Degree");
    }
}
class UnderGraduate extends Degree{

    void sameName(){
        System.out.println("I am an Under Graduate");
    }

}
class PostGraduate extends Degree{

    void sameName(){
        System.out.println("I am a Post Graduate");
    }

    public static void main(String[] args) {
        PostGraduate objGraduate = new PostGraduate();
        objGraduate.getDegree();
        objGraduate.sameName();

        UnderGraduate objUnderGraduate = new UnderGraduate();
        objUnderGraduate.sameName();
    }

}
