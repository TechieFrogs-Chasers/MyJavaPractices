package OopsConcepts;

public class Encaps {

    private String city;


    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public static void main(String[] args) {
        
        Encaps objEncaps = new Encaps();
        objEncaps.setCity("st.louis");
        System.out.println(objEncaps.city);
    }
    
}
