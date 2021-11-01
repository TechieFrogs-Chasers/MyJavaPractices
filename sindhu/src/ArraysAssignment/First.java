package sindhu.src.ArraysAssignment;

public class First {
    public static void main(String[] args) {
        
    

    int[] x = {1,2,3,4,5};

    int[] y = new int[x.length];
    
    
    for(int i=0;i<x.length;i++){
        y[i] = x[i];
    }

    for(int j=0;j<y.length;j++){
        System.out.println(y[j]);
    }
    
}
}

