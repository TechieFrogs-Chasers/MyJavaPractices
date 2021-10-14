package InterfacesPractice;
/* nested interafces in class */

interface NestedInterface {
    void call();
    interface SubWay{
        void road();

    }
}
    
class Knowledge implements NestedInterface.SubWay{
   public void road()
    {
        System.out.println("enter the route map");
    }
    public void call()
    {
        System.out.println("enter the number");
    }

    public static void main(String[] args) {
        NestedInterface.SubWay key = new Knowledge();
        key.road();
        

    }

}

