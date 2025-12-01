package orioncli.application.command.compression.zip;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.compression.zip.ZIPCompressionService;

@ShellComponent
public class CompressToZIPUsingDirectoryCommand
{
    @ShellMethod(key = "compress.zip.input-dirs")
    public String compressZIPInputDirs(@ShellOption(value = {"--out-dir", "-o"}) String targetFolder,
                    @ShellOption(value = {"--zip-name", "-n"}) String zipFileName,
                    @ShellOption(value = {"--dirs", "-d"}, arity = 1) List<String> directoriesToCompress) throws IOException
    {
        ZIPCompressionService.compressDirectories(targetFolder, zipFileName, new HashSet<>(directoriesToCompress));
        return "ZIP created";
    }
}
