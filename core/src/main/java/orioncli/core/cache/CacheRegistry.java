package orioncli.core.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheRegistry
{
    public static Map<String, Cache> caches;

    static
    {
        caches = new ConcurrentHashMap<>();
    }

    public static Cache getCache(String name)
    {
        return caches.get(name);
    }


    public static void addCache(String name, Cache cache)
    {
        caches.put(name, cache);
    }


    public static void deleteCache(String name)
    {
        caches.remove(name);
    }


    public static void empty()
    {
        caches.clear();
    }


    public static int getSize()
    {
        return caches.size();
    }
}
