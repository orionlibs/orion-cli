package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.Cache;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class CreateCacheCommand
{
    @ShellMethod(key = "cache.create")
    public String cacheCreate(@ShellOption(value = {"--name", "-n"}) String name)
    {
        CacheRegistry.addCache(name, new Cache(name));
        return "cache created";
    }
}
