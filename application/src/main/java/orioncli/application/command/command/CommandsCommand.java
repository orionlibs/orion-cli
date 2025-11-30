package orioncli.application.command.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CommandsCommand
{
    @ShellMethod(key = "commands")
    public String commands()
    {
        return "Available commands: help";
    }
}
