package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class EmptyCacheCommand
{
    @ShellMethod(key = "cache.empty")
    public String cacheEmpty(@ShellOption(value = {"--name", "-n"}) String name)
    {
        CacheRegistry.getCache(name).empty();
        return "cache emptied";
    }
}
