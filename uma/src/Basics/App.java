public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
      App obj = new App();
      System.out.println(obj);//prints ref obj

      multiply(10, 2); //static method does not need obj
      obj.add(10, 10);  // non static method needs obj
      obj.n();  //calling amethod inside a method using "this"

      
      //new App().getA().add(5, 5);  //return current class instance
    }

    static int multiply(int i,int j){
      int m= i * j ; 
      System.out.println(m);
      return m;
    }

     int add(int i,int j){
      int k= (i+j);
   System.out.println(k);
        return k;
    }
    void m(){
      System.out.println("hello");
    }
    void n(){
      this.m();
      System.out.println("using this");
    }
    App getA(){
      return this;   //
    }
    
}
