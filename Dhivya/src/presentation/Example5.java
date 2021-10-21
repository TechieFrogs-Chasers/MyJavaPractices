package presentation;

/*The class cannot implement two interfaces in java that have methods
 with same name but different return type.*/
public class Example5  implements A, B{

    @Override
    public int display() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void Welcome() {
        // TODO Auto-generated method stub
        
    }
    
}
interface A{

void display();
void Welcome();

}

interface B{

    int display();
    void Welcome();

}