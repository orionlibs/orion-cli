package orioncli.application.command.log;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.Logger;

@ShellComponent
public class LogErrorCommand
{
    @ShellMethod(key = "log.error")
    public String logError(@ShellOption(value = {"--message", "-m"}) String message)
    {
        Logger.error(message);
        return null;
    }
}
