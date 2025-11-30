package orioncli.application.command.cache;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.CacheRegistry;

@ShellComponent
public class DeleteCacheCommand
{
    @ShellMethod(key = "cache.delete")
    public String cacheDelete(@ShellOption(value = {"--name", "-n"}) String name)
    {
        CacheRegistry.deleteCache(name);
        return "cache deleted";
    }
}
