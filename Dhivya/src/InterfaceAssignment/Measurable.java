package InterfaceAssignment;
public interface Measurable {
   //double[] measure = {60000,56890,34678};
  double getMeasure();       
}
class Employee{
    static double average=80;
    public static double  average(Measurable object){
        object.getMeasure();   
        double average=80;
        return average;
    }
    public static void main(String[] args) 
    {
        Employee.average(new Measurable()
        {
            public double getMeasure()
            {
                System.out.println("hi am accessing interface anonymously: " + average);
                return average;
            }
        });
        
     }
}
