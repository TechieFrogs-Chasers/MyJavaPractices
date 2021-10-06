package sindhu.src.Methods;

public class Degree1 {

    void getDegree(){
        System.out.println(" I got a degree");
    }
}

    class Undergraduate extends Degree1{

        void Undergraduate(){

            System.out.println(" I am an undergraduate");
        }

    }

    class Postgraduate extends Undergraduate{

        void Postgraduate(){
            System.out.println("I am an post graduate");

        }

    

    public static void main(String[] args) {
        Postgraduate x = new Postgraduate();
        x.Undergraduate();
        x.Postgraduate();
        x.getDegree();

        
       

  

    }
}
    

