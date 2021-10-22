package OopsConcepts;

public interface CarInterface extends BMW,BENZ,AUDI {
    void meth();
}

interface BMW{
    void meth1();
}
interface BENZ{
    void meth2();
}
interface AUDI{
    void meth3();
}
class ShowRoom implements CarInterface{

	@Override
	public void meth1() {
        System.out.println("BMW");
			
	}

	@Override
	public void meth2() {
        System.out.println("BENZ");
		
	}

	@Override
	public void meth3() {
        System.out.println("AUDI");
			
	}

	@Override
	public void meth() {
        System.out.println("dealer");
		
	}

    void driver1(BENZ bz){
        System.out.println("benz");

    }
    void driver2 (BMW bw){
        System.out.println("bmw");

    }
    void driver3 (AUDI ad){
        System.out.println("audi");

    }

    

    public static void main(String[] args) {

       ShowRoom objShowRoom = new ShowRoom();
        objShowRoom.driver1(objShowRoom);
        objShowRoom.driver2(objShowRoom);
        objShowRoom.driver3(objShowRoom);
        
       

      
    
    }
    

}

    

