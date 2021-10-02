package OopsPractices;

public class AccessModiffers {
    public int a = 1 ;
    static int b = 2;
    private int c  = 3;
    protected int d = 4;
    protected void display() {
        System.out.println("protected dispaly method");
    }
    static void nameDisplay(){
        System.out.println("static dispaly method");
    }
    public static void main(String[] args) {
        AccessModiffers objAccessModiffers = new AccessModiffers();
        System.out.println(objAccessModiffers.a +AccessModiffers.b + objAccessModiffers.c) ;
        AccessModiffers.nameDisplay();
        objAccessModiffers.display();
    }
}
