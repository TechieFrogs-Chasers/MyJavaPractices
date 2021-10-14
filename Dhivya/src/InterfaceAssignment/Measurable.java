package InterfaceAssignment;
public interface Measurable {
    int[] measure = {60000,56890,34678};
    double getMeasure();   
}
class Employee implements Measurable{
    @Override
    public double getMeasure() {
        return 0;
    }
    double average(int[] measure){
       double sum =0;
       int j =0;
        for (int i= 0;i<measure.length;i++){
            sum+= measure[i] ;
            j=i;
        }
       double avg = sum/j;
       return avg;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("The average salary of the employee:"+ emp.average(measure));   
    }
}
