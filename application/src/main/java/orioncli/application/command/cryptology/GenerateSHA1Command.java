package orioncli.application.command.cryptology;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cryptology.hashing.sha.SHAHashingService;

@ShellComponent
public class GenerateSHA1Command
{
    @ShellMethod(key = "crypto.sha.1")
    public String generateSHA1(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return SHAHashingService.encodeDataToSHA1(text);
    }
}
