package sindhu.src;

public class EncapsSession {
    int i=6;
   private String name;

   public int getI(){
       return i;
   }
   public void setI(int i) {
       this.i =i;
       
   }

   public String getName(){
       return name;
   }
   public void setName(String  newname){
       name = newname;
   }
}
class Run{
    public static void main(String[] args) {
        EncapsSession x = new EncapsSession();
        System.out.println(x.i);
        x.setI(7);
        x.setName("sindhu");
        System.out.println(x.getI());
        System.out.println(x.getName());
        
    }
}