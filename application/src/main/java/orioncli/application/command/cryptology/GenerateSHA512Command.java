package orioncli.application.command.cryptology;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cryptology.hashing.sha.SHAHashingService;

@ShellComponent
public class GenerateSHA512Command
{
    @ShellMethod(key = "crypto.sha.512")
    public String generateSHA512(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return SHAHashingService.encodeDataToSHA512(text);
    }
}
