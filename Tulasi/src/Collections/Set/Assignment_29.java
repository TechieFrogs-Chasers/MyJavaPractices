package Collections.Set;

import java.util.*;

//Explain Can We add duplicate user-defined objects to Set implemented classes with an example? If yes then what is solution?
// Yes, we can add duplicate in set implemented classes of user-defined objects.
public class Assignment_29 {
    public static void main(String[] args) {
       Set<UserDefinedClass> uds=new LinkedHashSet<UserDefinedClass>();
       uds.add(new UserDefinedClass(11,"Jim","English"));
       uds.add(new UserDefinedClass(12,"Leo","Maths"));
       uds.add(new UserDefinedClass(13,"Tom","Hindi"));
        System.out.println(uds);

    }
}
