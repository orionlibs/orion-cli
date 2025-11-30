package orioncli.application.command.help;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelpCommand
{
    @ShellMethod(key = "commands")
    public String commands()
    {
        return "Available commands: help";
    }
}
