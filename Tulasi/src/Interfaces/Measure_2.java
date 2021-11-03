package Interfaces;
interface Measurable{
    default double getMeasure(){
        return 5.5;
    }
}
class Employee implements Measurable{
    double average=15;
    double average(Measurable[] object  ){
        return average;
    }
}
public class Measure_2 {
    public static void main(String[] args) {

        Employee obj = new Employee();
        System.out.println(obj.average);
    }
}