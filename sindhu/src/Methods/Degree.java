package sindhu.src.Methods;


public class Degree{
    void getDegree (){
        System.out.println("I got a degree");
        class Undergraduate {
            void graduate(){

            }
        }
        Degree underGraduateObj = new Degree();
        System.out.println("I am an Undergraduate!");

        class Postgraduate {
            void graduate() {


            }
        }
        Degree postGraduateObj = new Degree();
        System.out.println("I am a Postgraduate!");
    }

    public static void main(String[] args) {
        Degree mehtodobj = new Degree();
        mehtodobj.getDegree();

    }

}

    

