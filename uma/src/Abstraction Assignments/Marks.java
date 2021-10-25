public abstract class Marks {

    abstract int getPercentage();

    
}
  class StudentA extends Marks{
 
    int total,physics,math,tech;

    StudentA(int physics,int math,int tech){

        total=(physics+ math+tech);
    }
     

    int  getPercentage(){

        int percentage = (total*100)/300;
        System.out.println(percentage);
        return percentage;
    }
}
  class StudentB extends Marks{
    int total,physics,math,tech,bio;

    StudentB(int physics,int math,int tech,int bio){

        total= (physics+math+tech+bio);
    }
    
    int getPercentage(){

        int percentage = (total*100)/400;
        System.out.println(percentage);
        return percentage;
    }
}
class Percentage{
    
public static void main(String[] args) {
    

 StudentB obj2B = new StudentB(50, 50, 50, 50);

 obj2B.getPercentage();

 StudentA obj1A =new StudentA(60, 60, 80);
 obj1A.getPercentage();
 
}
}
