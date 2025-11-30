package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class GetCacheSizeCommand
{
    @ShellMethod(key = "cache.size")
    public String cacheSize(@ShellOption(value = {"--name", "-n"}) String name)
    {
        return "size: " + CacheRegistry.getCache(name).getSize();
    }
}
