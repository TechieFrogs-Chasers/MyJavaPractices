public interface Measurable {

    double getMeasure();
    
}

class Employee implements Measurable{

    int salary;

    public double getMeasure(){
        return 10.00;
    }

    double average(){
        return 10.00;
    }
}



    

