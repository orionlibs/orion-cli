package orioncli.core.tuple.tasks;

import java.util.Arrays;
import orioncli.core.tuple.NTuple;

public class EqualsForNTupleTask
{
    public static boolean run(Object object1, Object object2)
    {
        if(object2 == null || object1.getClass() != object2.getClass())
        {
            return false;
        }
        else
        {
            NTuple thisObject = (NTuple)object1;
            NTuple other = (NTuple)object2;
            return Arrays.equals(thisObject.getElements(), other.getElements());
        }
    }
}