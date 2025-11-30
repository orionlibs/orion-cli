package orioncli.application.command.log;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.Logger;

@ShellComponent
public class LogCommand
{
    @ShellMethod(key = "log.info")
    public String help(@ShellOption(value = {"--message", "-m"}) String message)
    {
        Logger.info(message);
        return "";
    }
}
