public class ArrayAsParameter {

    public static void main(String[] args) {

      // String[] cars = new String[4];

      String[] cars = {"BMW","TESLA","AUDI"};

      System.out.println(cars[2]);

      int[] arr =new int[]{20,30,40};

      double[] dub =new double[2];
      dub[0] = 5.78;
      dub[1] = 3.9f;

 
      ArrayAsParameter obj = new ArrayAsParameter(dub);
      obj.display(cars);
      myfav(arr);
     // obj.myreturn(arr);
      obj.unknown(new int[]{20,50,12}); // anonymous array
      obj.unknown(new int[3]); //prints 0,0,0 //  anonymous array
      obj.inturn();
        
    }

    ArrayAsParameter(double[] d){ // constructor
        for (int i=0; i<d.length; i++){
            System.out.println(d[i]);
        }
    }


    void display(String[] s){
  
        for (int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
    static void myfav(int[]m){
         for (int i=0; i<m.length; i++){
             System.out.println(m[i]);

        }
    }
    /*int[] myreturn(int[] k){
     int[] l= new int[k.length];
     System.out.println(l);
     return l;

    }*/

   
    void unknown(int[]u){
        for (int i=0; i<u.length; i++){
            System.out.println(u[i]);
        }
    }

    int[] inturn(){
        int[] g=new int[]{100,200,300};
        for(int i=0; i<g.length; i++)
        System.out.println(g[i]);
        return g;
    }
    
}
    

