package practice;

class practice {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

}

public class GetterSetter {
    public static void main(String[] args) {
        practice srikanth = new practice();
        // srikanth.id = 45;
        // srikanth.name = "TechiFrogs";
        srikanth.setName("TechiFrogs");
        System.out.println(srikanth.getName());
    }
}
