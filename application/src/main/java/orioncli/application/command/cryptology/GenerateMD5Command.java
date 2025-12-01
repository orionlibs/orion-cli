package orioncli.application.command.cryptology;

import java.security.NoSuchAlgorithmException;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cryptology.hashing.md5.MD5HashingService;

@ShellComponent
public class GenerateMD5Command
{
    @ShellMethod(key = "crypto.md5")
    public String generateMD5(@ShellOption(value = {"--text", "-t"}) String text) throws NoSuchAlgorithmException
    {
        return MD5HashingService.encodeToMD5(text);
    }
}
