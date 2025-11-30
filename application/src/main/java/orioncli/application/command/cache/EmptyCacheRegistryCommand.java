package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class EmptyCacheRegistryCommand
{
    @ShellMethod(key = "cache.delete-all")
    public String cacheDeleteAll()
    {
        CacheRegistry.empty();
        return "cache registry emptied";
    }
}
