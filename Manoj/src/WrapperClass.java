public class WrapperClass {
    //wrapperclass is converts obj to wrapper  class
    public static void main(String[] args) {
        int i=99;
        float f=i;//widening 
        Float fi=new Float(i);//its giving warning but still it excutes 
        Integer i1=i;//boxing  only corresponding dates will be kept
        int i2=i1;//unboxing 
        System.out.println("wrapper class of interger "+i1);
        System.out.println("wraper class of float :"+fi);
        System.out.println(i2);
    }
    
}
