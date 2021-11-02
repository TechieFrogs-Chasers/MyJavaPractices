//import java.util.Scanner;
package MethodAssignment;
 class Students {
    String name;
    int age;
    String address;
    
    public Students() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not available";
    }
  /*  public Students(String name, int age) {
        this.name = name;
        this.age =age ;
    }
    public  Students(String Name, int age, String addr) {
        this.name = Name;
        this.age = age;
        this.address = addr;
    }*/
    public void setInfo(String str,int num){
        name = str;
        age = num;
        System.out.println("Name is: "+name+",  Age is: "+age);
    }
    public void setInfo(String str,int num,String addr){
        name = str;
        age = num;
        address = addr;
        System.out.println("Name is: "+name+",  Age is: "+age+",  Address is: "+address);
    }
}
public class StudentTest extends Students{
    public static void main(String[] args) {
        Students stu[] = new Students[10];
        
            stu[0] = new Students();
            stu[0].setInfo("hyderabad",5);
  
            stu[1] = new Students();
            stu[1].setInfo("Anu",10,"Texas");
           
            stu[2] = new Students();
            stu[2].setInfo("John",40);

            stu[3] = new Students();
            stu[3].setInfo("Joe",20,"NYC");

            stu[4] = new Students();
            stu[4].setInfo("claire",26,"Washington DC");

            stu[5] = new Students();
            stu[5].setInfo("shan",25,"Mexico");

            stu[6] = new Students();
            stu[6].setInfo("Angel",31);

            stu[7] = new Students();
            stu[7].setInfo("Ryan",27,"Florida");

            stu[8] = new Students();
            stu[8].setInfo("Retz",45);

            stu[9] = new Students();
            stu[9].setInfo("Fogarty",32,"Terwig");
      
    }
}
