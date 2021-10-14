package sindhu.src.Methods;

public class Student {
    int Age;
    String Name;
    String Address;

    Student(){
        String name = "unknown";
        int age = 0;
        String address = "not available";

        System.out.println(name+ " "+ age+ " "+ address);


}

void SetInfo(String name, int i){
    this.Name = name;
    this.Age = i ;
    System.out.println("name" +" "+ i);
}

void SetInfo(String name, int i , String address){
    this.Name = name;
    this.Age = i;
    this.Address = address;

}

public static void main(String[] args) {
    Student x = new Student();
    x.SetInfo("sindhu",6);

}


}
    

