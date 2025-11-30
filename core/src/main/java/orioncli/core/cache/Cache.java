package orioncli.core.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lombok.Getter;

@Getter
public class Cache
{
    private ConcurrentMap<String, Object> cache;
    private String name;


    public Cache(String name)
    {
        this.cache = new ConcurrentHashMap<>();
        this.name = name;
    }


    public Object addEntry(String key, Object value)
    {
        return cache.put(key, value);
    }


    public Object deleteEntry(String key)
    {
        return cache.remove(key);
    }


    public void empty()
    {
        cache.clear();
    }


    public int getSize()
    {
        return this.cache.size();
    }
}
