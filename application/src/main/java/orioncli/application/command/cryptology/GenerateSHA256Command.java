package orioncli.application.command.cryptology;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cryptology.hashing.sha.SHAHashingService;

@ShellComponent
public class GenerateSHA256Command
{
    @ShellMethod(key = "crypto.sha.256")
    public String generateSHA256(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return SHAHashingService.encodeDataToSHA256(text);
    }
}
