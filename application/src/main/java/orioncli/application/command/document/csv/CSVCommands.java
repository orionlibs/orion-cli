package orioncli.application.command.document.csv;

import java.io.IOException;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.cache.Cache;
import orioncli.core.cache.CacheRegistry;
import orioncli.core.document.csv.CSVReaderService;

@ShellComponent
public class CSVCommands
{
    @ShellMethod(key = "csv.read-file.as-string")
    public String parseCSVFileAsString(@ShellOption(value = {"--file", "-f"}) String file,
                    @ShellOption(value = {"--cache", "-c"}) String cacheNameToStoreCSVTo,
                    @ShellOption(value = {"--cache-key", "-ck"}) String cacheKeyToStoreCSVUnder) throws IOException
    {
        CSVReaderService csv = new CSVReaderService(file);
        if(CacheRegistry.getCache(cacheNameToStoreCSVTo) == null)
        {
            CacheRegistry.addCache(cacheNameToStoreCSVTo, new Cache(cacheNameToStoreCSVTo));
        }
        CacheRegistry.getCache(cacheNameToStoreCSVTo).addEntry(cacheKeyToStoreCSVUnder, csv.getCSVAsString());
        csv.closeCSVFile();
        return "CSV parsed";
    }
}
