package orioncli.core.file_system.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class RenameFileOrDirectoryTask
{
    public static void run(String originalFileOrDirPath, String newFileOrDirName) throws IOException
    {
        run(new File(originalFileOrDirPath), newFileOrDirName);
    }


    public static void run(File originalFileOrDir, String newFileOrDirName) throws IOException
    {
        if(!originalFileOrDir.exists())
        {
            originalFileOrDir.createNewFile();
        }
        else
        {
            StringBuilder sb = new StringBuilder(originalFileOrDir.getParentFile().getAbsolutePath());
            sb.append(File.separator);
            sb.append(newFileOrDirName);
            String newFileOrDirPathName = sb.toString();
            Path originalFileOrDirPath = originalFileOrDir.toPath();
            Path newFileOrDirPath = new File(newFileOrDirPathName).toPath();
            Files.move(originalFileOrDirPath, newFileOrDirPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}