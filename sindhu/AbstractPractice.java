package sindhu;

/*abstract class AbstractPractice {

    private int age;

    private String name;


    void hoy() {
        System.out.println("normal method");
    }                   

    abstract void hi(); // abstract method



    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    AbstractPractice(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        
        AbstractPractice x = new AbstractPractice();



            
            
            @Override
            void hi() {
                
                
            }
            
        };
    }
    
    
}*/

abstract class AbstractPractice
{
    int i;
    int age;

    abstract void hi();     //abstract method

    abstract void foo();

    void hey(){                                  //normal method
        System.out.println("normal method");
    }
}

 abstract class subclass extends AbstractPractice
 {
    int j;
    String name;

    void hi(){
        System.out.println("implementing abstract method");
    }

    abstract void oy();

    void oye(){
        System.out.println("implementing method from other class");
    }

}

abstract class otherclass extends subclass
{
    int id;

   void oy(){
        System.out.println("implementing subclass abstract method");
    }
    
    abstract void oye();
}

class suby extends otherclass
{

    void oye(){
        System.out.println("implementing method from other class");
    }

public static void main(String[] args)
    {

        suby x = new suby();
        x.hi();
        x.hey();
        x.oye();
        
        
    }
}
