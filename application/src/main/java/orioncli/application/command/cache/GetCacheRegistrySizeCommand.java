package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class GetCacheRegistrySizeCommand
{
    @ShellMethod(key = "cache.registry-size")
    public String cacheRegistrySize()
    {
        return "size: " + CacheRegistry.getSize();
    }
}
