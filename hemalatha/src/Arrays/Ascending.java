package Arrays;

public class Ascending {
    public static void main(String[] args) {
        int a[] = new int[]{9,4,6,1,8,0,2,5};
         int temp=0;
         System.out.println("before sorting elements in the array:");
            for(int i=0;i<a.length;i++){
             System.out.print(a[i]+ " ");
            }
         
             for(int i=0;i<a.length;i++){
                 for(int j=i+1;j<a.length;j++){   
                     if(a[i]>a[j]){
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
                }
             }
                 System.out.println(" ");
                    System.out.println("after sorting elements in array:");
                        for(int i=0;i<a.length;i++){
                            System.out.print(a[i]+ " ");
                        }
                }
            }
            

                 
             
            
         
    
    

