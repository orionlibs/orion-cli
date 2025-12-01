package orioncli.application.command.runtime;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class GetNumberOfCPUsCommand
{
    @ShellMethod(key = "runtime.cpus")
    public int getNumberOfCPUs()
    {
        return Runtime.getRuntime().availableProcessors();
    }
}
