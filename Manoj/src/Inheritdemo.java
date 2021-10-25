public  class Inheritdemo {
    void name(){
        System.out.println("inherit 2");
    }
    
}

class Inherit2nd extends Inheritdemo{
    void name(){
        System.out.println("inherit 3");
    }
    public static void main(String...args){
        Inherit2nd obj=new Inherit2nd();
        obj.name();
        obj.name();

    }
}
