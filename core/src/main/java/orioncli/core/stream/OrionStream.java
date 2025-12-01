package orioncli.core.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OrionStream
{
    public static <T> Stream<T> filter(Stream<T> stream, Predicate<T> filterToApply)
    {
        return stream.filter(filterToApply);
    }


    public static <T> Stream<T> filter(T[] array, Predicate<T> filterToApply)
    {
        return Arrays.stream(array).filter(filterToApply);
    }


    public static <T> Stream<T> filter(Collection<T> elements, Predicate<T> filterToApply)
    {
        return elements.stream().filter(filterToApply);
    }


    public static <T> void forAllIndices(T[] array, IntConsumer action)
    {
        IntStream.range(0, array.length).forEach(action);
    }


    public static <T> void forAllIndices(List<T> elements, IntConsumer action)
    {
        IntStream.range(0, elements.size()).forEach(action);
    }


    public static <T> boolean findAny(T[] array, Predicate<T> filterToApply)
    {
        return Arrays.stream(array).anyMatch(filterToApply);
    }


    public static <T> boolean findAny(Collection<T> elements, Predicate<T> filterToApply)
    {
        return elements.stream().anyMatch(filterToApply);
    }


    public static <T> boolean findAny(T[] array, IntPredicate filterToApply)
    {
        return IntStream.range(0, array.length).anyMatch(filterToApply);
    }


    public static <T> boolean findAny(List<T> elements, IntPredicate filterToApply)
    {
        return IntStream.range(0, elements.size()).anyMatch(filterToApply);
    }


    public static <T> boolean findNone(T[] array, Predicate<T> filterToApply)
    {
        return Arrays.stream(array).noneMatch(filterToApply);
    }


    public static <T> boolean findNone(Collection<T> elements, Predicate<T> filterToApply)
    {
        return elements.stream().noneMatch(filterToApply);
    }


    public static <T> boolean findNone(T[] array, IntPredicate filterToApply)
    {
        return IntStream.range(0, array.length).noneMatch(filterToApply);
    }


    public static <T> boolean findNone(List<T> elements, IntPredicate filterToApply)
    {
        return IntStream.range(0, elements.size()).noneMatch(filterToApply);
    }


    public static <T> T findFirst(List<T> elements, IntPredicate filterToApply)
    {
        for(int i = 0; i < elements.size(); i++)
        {
            if(filterToApply.test(i))
            {
                return elements.get(i);
            }
        }
        return null;
    }


    public static <T> int findFirstIndex(List<T> elements, IntPredicate filterToApply)
    {
        for(int i = 0; i < elements.size(); i++)
        {
            if(filterToApply.test(i))
            {
                return i;
            }
        }
        return -1;
    }


    public static <T> T findFirst(T[] elements, IntPredicate filterToApply)
    {
        return findFirst(Arrays.asList(elements), filterToApply);
    }


    public static <T> int findFirstIndex(T[] elements, IntPredicate filterToApply)
    {
        return findFirstIndex(Arrays.asList(elements), filterToApply);
    }


    public static <T> void forAll(T[] array, Consumer<T> action)
    {
        Arrays.stream(array).forEach(action);
    }


    public static <T> void forAll(Collection<T> elements, Consumer<T> action)
    {
        elements.stream().forEach(action);
    }


    public static <T> void forAll(Stream<T> stream, Consumer<T> action)
    {
        stream.forEach(action);
    }


    public static <T> void forAll(IntStream stream, IntConsumer action)
    {
        stream.forEach(action);
    }


    public static <T> void filterAndLoop(T[] array, Predicate<T> filterToApply, Consumer<T> action)
    {
        forAll(filter(array, filterToApply), action);
    }


    public static <T> void filterAndLoop(Collection<T> elements, Predicate<T> filterToApply, Consumer<T> action)
    {
        forAll(filter(elements, filterToApply), action);
    }


    public static <T> void filterAndLoop(T[] array, IntPredicate filterToApply, IntConsumer action)
    {
        forAll(IntStream.range(0, array.length).filter(filterToApply), action);
    }


    public static <T> void filterAndLoop(List<T> elements, IntPredicate filterToApply, IntConsumer action)
    {
        forAll(IntStream.range(0, elements.size()).filter(filterToApply), action);
    }


    public static <T> List<T> getAsList(Stream<T> stream)
    {
        return stream.collect(Collectors.toList());
    }


    public static <T> Set<T> getAsSet(Stream<T> stream)
    {
        return stream.collect(Collectors.toSet());
    }


    @SuppressWarnings("unchecked")
    public static <T> T[] getAsArray(Stream<T> stream, Class<T> classToCastElementsTo)
    {
        List<T> list = getAsList(stream);
        T[] array = (T[])Array.newInstance(classToCastElementsTo, list.size());
        IntStream.range(0, list.size()).forEach(i -> array[i] = list.get(i));
        return array;
    }
}