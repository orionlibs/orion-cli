package orioncli.application.command.compression.zip;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.compression.zip.ZIPCompressionService;

@ShellComponent
public class CompressToZIPUsingFilesCommand
{
    @ShellMethod(key = "compress.zip.input-files")
    public String compressZIPInputFiles(@ShellOption(value = {"--out-dir", "-o"}) String targetFolder,
                    @ShellOption(value = {"--zip-name", "-n"}) String zipFileName,
                    @ShellOption(value = {"--files", "-f"}, arity = 1) List<String> filesPathsToCompress) throws IOException
    {
        Set<File> filesToCompress = new HashSet<>();
        for(String filesPath : filesPathsToCompress)
        {
            filesToCompress.add(new File(filesPath));
        }
        ZIPCompressionService.compress(targetFolder, zipFileName, filesToCompress);
        return "ZIP created";
    }
}
