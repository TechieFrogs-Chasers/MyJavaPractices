package Methods;//Package

public class Degree {//Driver class
    void getDegree () {//method
        System.out.println("I got a degree");
        class Undergraduate {//Class in side the method-first class
            void graduate() {//method inside innerclass

            }
        }
        Degree underGraduateObj = new Degree();//Creating Instance
        System.out.println("I am an Undergraduate!");

        class Postgraduate {//Class in side the method-second class
            void graduate() {//method inside innerclass


            }
        }
        Degree postGraduateObj = new Degree();//Creating Instance
        System.out.println("I am a Postgraduate!");
    }

    public static void main(String[] args) {//main method
        Degree mehtodobj = new Degree();//Instance for method
        mehtodobj.getDegree();//accessing method

    }

}
