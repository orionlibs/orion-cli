package orioncli.core.tuple;

import java.util.List;

public interface Tuple
{
    Object get(int index);


    Object[] getAsArray();


    List<Object> getAsList();


    boolean isEmpty();
}