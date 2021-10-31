public class CloneMatrix {

    public static void main(String[] args) {
        
        int[][]  a = new int[][]{{1,2,3},{5,6,7},{7,8,9}};

        for (int i=0; i<a.length; i++){
            for( int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        int[][] b = a.clone(); // cloning (making a duplicate copy)
        
        for (int i=0; i<b.length; i++){
            for( int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }


        System.out.println(a==b);   //false
        System.out.println(a.equals(b));  //false

    }
    
}
