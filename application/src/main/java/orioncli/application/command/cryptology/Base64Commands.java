package orioncli.application.command.cryptology;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cryptology.encoding.base64.Base64EncodingService;

@ShellComponent
public class Base64Commands
{
    @ShellMethod(key = "crypto.base.64.encode.for-string")
    public String encodeBase64ForString(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return Base64EncodingService.encodeBase64ForString(text);
    }


    @ShellMethod(key = "crypto.base.64.encode.for-url")
    public String encodeBase64ForURL(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return Base64EncodingService.encodeBase64ForURL(text);
    }


    @ShellMethod(key = "crypto.base.64.decode.for-string")
    public String decodeBase64ForString(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return Base64EncodingService.decodeBase64ForString(text);
    }


    @ShellMethod(key = "crypto.base.64.decode.for-url")
    public String decodeBase64ForURL(@ShellOption(value = {"--text", "-t"}) String text)
    {
        return Base64EncodingService.decodeBase64ForURL(text);
    }
}
