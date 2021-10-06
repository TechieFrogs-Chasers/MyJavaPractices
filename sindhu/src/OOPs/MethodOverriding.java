package sindhu.src.OOPs;

public class MethodOverriding {

    void hi(){
        System.out.println("method override");
    }
    
}

class Over {

    void hi(){
        System.out.println("method name");
    }

    public static void main(String[] args) {
        Over x = new Over();
        x.hi();
    }
}
