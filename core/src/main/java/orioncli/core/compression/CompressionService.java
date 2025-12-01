package orioncli.core.compression;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import orioncli.core.compression.zip.ZIPCompressionService;

public class CompressionService
{
    public static void compressFilesToZIP(String targetFolder, String zipFileName, Set<File> filesToCompress) throws IOException
    {
        ZIPCompressionService.compress(targetFolder, zipFileName, filesToCompress);
    }


    public static void compressDirectoriesToZIP(String targetFolder, String zipFileName, Set<String> pathsToCompress) throws IOException
    {
        ZIPCompressionService.compressDirectories(targetFolder, zipFileName, pathsToCompress);
    }
}
