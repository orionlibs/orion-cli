package orioncli.core.file_system.directory;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import orioncli.core.file_system.FileSystemService;

public class DirectoryService
{
    public static boolean emptyDirectory(File directory) throws IOException
    {
        FileUtils.cleanDirectory(directory);
        return true;
    }


    public static boolean emptyDirectory(String directory) throws IOException
    {
        return emptyDirectory(new File(directory));
    }


    public static void renameDirectory(String originalDirectoryPath, String newDirectoryName) throws IOException
    {
        FileSystemService.renameFileOrDirectory(originalDirectoryPath, newDirectoryName);
    }


    public static void renameDirectory(File originalDirectoryPath, String newDirectoryName) throws IOException
    {
        FileSystemService.renameFileOrDirectory(originalDirectoryPath, newDirectoryName);
    }


    public static boolean createDirectory(String newDirectoryName)
    {
        return createDirectory(new File(newDirectoryName));
    }


    public static boolean createDirectory(File newDirectoryName)
    {
        return newDirectoryName.mkdirs();
    }
}