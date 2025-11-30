package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.Cache;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class AddElementToCacheCommand
{
    @ShellMethod(key = "cache.element.add")
    public String cacheElementAdd(@ShellOption(value = {"--name", "-n"}) String name,
                    @ShellOption(value = {"--key", "-k"}) String key,
                    @ShellOption(value = {"--value", "-v"}) String value)
    {
        if(CacheRegistry.getCache(name) == null)
        {
            CacheRegistry.addCache(name, new Cache(name));
        }
        CacheRegistry.getCache(name).addEntry(key, value);
        return "added to cache";
    }
}
