package OopsPractices.InheritanceAssignment;
class A{
int i;
int j;
void Show(int i,int j){
    System.out.println(i +" "+j);
}
A( ){

}
}
class B extends A{
    int k;
    void Show(int k){
        System.out.println(k);
    }
    B(){

    }
}
public class Classes {
    public static void main(String[] args) {
        B obj = new B();
        obj.Show(6,9);
        obj.Show(4);
    }
}
