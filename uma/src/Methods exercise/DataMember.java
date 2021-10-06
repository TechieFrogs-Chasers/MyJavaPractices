public class DataMember{

    int i;

    void printNum(){
        System.out.println(i);
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
class Data extends DataMember{
    int j;

    void printNum(){
        System.out.println(j);
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public static void main(String[] args) {
        
        Data objData = new Data();
        
        objData.setJ(20);

        objData.printNum();

        DataMember obj = new DataMember();

        obj.setI(10);
        obj.printNum();
    }

}