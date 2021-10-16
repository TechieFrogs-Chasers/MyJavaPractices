package OopsConcepts;



// using interface as datatype/return type

public interface DatatypeAsInterface {

    void run();

    class Master{     //Class inside an interface
    
        private DatatypeAsInterface k;  //interface as data type(instead of private int k ---private interfcae k)

        Master(DatatypeAsInterface i){   //constructor with interface as return/data type
            this.k=i;

        }

        public DatatypeAsInterface method(){  //method with interface as return type
           return this.k;
         // return ParameterInterface;
        }

        public void method1(DatatypeAsInterface m){   //void method where interface is the data type in parameter
            this.k=m;
        }

        public void any(){
            DatatypeAsInterface obj =null;
            obj = this.k;
            obj.run();
        }




    }
    
}
class Para implements DatatypeAsInterface{

    public void run(){
        System.out.println("run");
    }

    private DatatypeAsInterface k;  //interface as data type

        Para(DatatypeAsInterface i){   //constructor with interface as return/data type
            this.k=i;

        }

        public DatatypeAsInterface method(){  //method with interface as return type
            return this.k;

        }

        public void method1(DatatypeAsInterface m){   //void method where interface is the data type in parameter
            this.k=m;
        }

        public void any(){
            DatatypeAsInterface obj =null;
            obj = this.k;
            obj.run();
        }
}
