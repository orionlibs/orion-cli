package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class GetElementFromCacheCommand
{
    @ShellMethod(key = "cache.element.get")
    public String cacheElementGet(@ShellOption(value = {"--name", "-n"}) String name,
                    @ShellOption(value = {"--key", "-k"}) String key)
    {
        return CacheRegistry.getCache(name).getCache().get(key).toString();
    }
}
