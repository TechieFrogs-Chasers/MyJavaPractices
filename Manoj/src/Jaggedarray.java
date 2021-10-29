public class Jaggedarray {
    public static void main (String...args){
        int jagedarr[][]=new int [3][];
        jagedarr[0]=new int []{1,2,3};
        jagedarr[1]=new int []{4,5,6,7,};
        jagedarr[2]=new int []{8,9,10,11,12};
        for (int i=0;i<jagedarr.length;i++){
            for (int j=0;j<jagedarr[i].length;j++){
                 System.out.print(jagedarr[i][j]);
            }
        System.out.println();
        }
        


    }
    
}
