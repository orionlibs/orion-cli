package orioncli.core.stream;

import java.util.stream.IntStream;

public class OrionArrays
{
    public static void setValue(int[] array, int value)
    {
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static void setValue(boolean[] array, boolean value)
    {
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static void fillArrayWithBooleanValue(boolean[] array, boolean value)
    {
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static <T> Object[] getAsArrayOfObjects(T[] array)
    {
        Object[] newArray = new Object[array.length];
        IntStream.range(0, array.length).forEach(i -> newArray[i] = (Object)array[i]);
        return newArray;
    }
}