package OOPS;

public class Methods {
    int a, b, c;
    public static void main(String[] args) {
        Methods metObj = new Methods();
        
        //System.out.println(c);
        metObj.display();
        helloWorld();
        //metObj.write(7, 8);
        System.out.println(metObj.write(7, 8));
        //System.out.println(metObj.write1("Janu", "Mounika" ));
        //metObj.write1("Janu", "Mounika");
       System.out.println(metObj.write("Janu", "Mounika"));

    }
    void display(){ //void used if the method is not returning any thing, then we use void
        //this.a = a;
        //this.b = b; 
        System.out.println("Hi");
    }
     static void helloWorld(){
            Methods metObj = new Methods();
            metObj.c=1;
            System.out.println("JAnu");

    }
     int write(int a, int b){
        this.a=a;
        this.b=b;
       //System.out.println(a+b);
        return a+b;
    }
    public String write(String name1, String name2){// in genreall the method doesn't accept but here the type of aurg id diff so accepted
        name1 = "Mounik";
        name2 = "Jan";
       return name1;//System.out.println("Hello");
    }
        

    
    
}
