public interface MethodLocalInterface{
    int a=10;
    void  property();
}


class Local {

    public static void main(String[] args) {
    
        Local objLocal = new  Local();
        objLocal.Outer();

        
    }

    public MethodLocalInterface Outer(){   //method

        
        
        class Inner implements MethodLocalInterface{  //method local class

            
            public void property(){

            }

        }
        return this.Outer();

    }
}