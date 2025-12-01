package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class DeleteElementFromCacheCommand
{
    @ShellMethod(key = "cache.element.delete")
    public String cacheElementDelete(@ShellOption(value = {"--name", "-n"}) String name,
                    @ShellOption(value = {"--key", "-k"}) String key)
    {
        CacheRegistry.getCache(name).deleteEntry(key);
        return "deleted element from cache";
    }
}
