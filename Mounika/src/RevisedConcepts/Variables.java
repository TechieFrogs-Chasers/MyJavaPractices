public class Variables {
    //instance variables
    int marks= 900;
//static should be in instace variable not in local variable, memory allocated in statci area, memory aloocated only once
    final long rollNumber;
    //Value not changes for final, final variable shpuld be intializes
    {
        rollNumber =1524863475;////instance initializer block
    }
    final static float percentage;//for constant values we use final and static
    static{//staic intializer block
        percentage=90f;
        
    }
    static short age= 20;
    public static void main(String[] args) {
        char ch = 'N';
        String name = "Mounika";
        boolean one = false;
        System.out.println("Name: "+ch+" "+name);
        System.out.println("Age: "+age);//instance but static variable, calling in static method no need of obj
        Variables PracticeObj = new Variables();//for instance variables creatiing a obj to print the values
        System.out.println("Marks:"+PracticeObj.marks);//marks non static, used obj reference to call the marks variable
        System.out.println("Percentage: "+percentage);
        System.out.println(!one);
    }

    
}
