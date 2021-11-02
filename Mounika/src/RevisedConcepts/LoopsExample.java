

public class LoopsExample {
    public static void main(String[] args) {
        int i=5, j = 15;
            while(i<=10){
                if(i==8)
                break;
                System.out.println("Value of i :"+i);
                i++;
            }
                    do{
                            if(j<=18){
                                System.out.println("Value of j :"+j);
                            j++;
                            }
                            System.out.println("Value of j :"+j);
                            j++;
                    }while(j<=20);
                    System.out.println("Value of i :"+i);
                    System.out.println("Value of j :"+j);

                       aa:
                            for(i=5;i<=10;i++){
                                bb:
                                    for(j=21;j<=25;j++){
                                        if(i==7 && j==25){
                                           // System.out.println(i+" "+j);
                                        break aa;
                                        }
                                        //System.out.println(i+" "+j);
                                        else{
                                            String name ="Mounika";
                                            
                                            switch(name){
                                                case "Madhu": System.out.println("Madhu");
                                                case "Sri": System.out.println("Sri");
                                                case "Mounika":{
                                                   System.out.println("Mounika");
                                                 System.out.println(i+" "+j);
                                                  int name1 =(i<j)? i : j;
                                                  System.out.println(name1);
                                                }
                                                 // default: System.out.println("Name : "+name);
                                                }
                                            
                                        }
                                            
                                    }
                               }
                       }

                        
        
    }
    

