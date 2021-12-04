package Collections.Set;

import java.util.*;

//29.Explain Can We add duplicate user-defined objects to Set implemented classes with an example? If yes then what is solution?
// Yes, we can add duplicate in set implemented classes of user-defined objects.
public class Assignment_29 {
    public static void main(String[] args) {
       Set<UserDefinedClass_29> uds=new LinkedHashSet<UserDefinedClass_29>();
       uds.add(new UserDefinedClass_29(11,"Jim","English"));
       uds.add(new UserDefinedClass_29(12,"Leo","Maths"));
       uds.add(new UserDefinedClass_29(13,"Tom","Hindi"));
        System.out.println(uds);
    }
}
