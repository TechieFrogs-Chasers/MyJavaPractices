package sindhu.src.ArraysAssignment;

public class Nineteenth {

    public static void main(String[] args) {
        
        String[] x ={"java","ant", "dog", "cat", "java", "dog"};

        for(int i=0;i<x.length;i++){

            for(int j =i+1; j<x.length;j++){

                if ((x[i].equals(x[j])) && (i!=j)){

                    System.out.println(x[j]);
                }
            }
        }
    }
    
}
