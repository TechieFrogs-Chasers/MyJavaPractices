/*public class toggle {
    public static void main(String[] args) {
        
        String x = "this is sindhu";

                String words[]= x.split("\\s");  
                String toggle="";  
                for(int i=0; i<words.length;i++){  

                    String w = words[i];
                    String first=w.substring(0,1);  
                    String afterfirst=w.substring(1);  
                    toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
                }  
                System.out.println(toggle);
                
            }  
             
    }*/
    

//reverse toggle

public class toggle {
    public static void main(String[] args) {
        
        String x = "this is sindhu";

                String words[]= x.split("\\s");  
                String toggle="";  
                for(int i=0; i<words.length;i++){  

                    String w = words[i];
                    StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
                    String first=sb.substring(0,1);  
                    String afterfirst=sb.substring(1);  
                    toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
                }  
                System.out.println(toggle);
                
            }  
             
    }
