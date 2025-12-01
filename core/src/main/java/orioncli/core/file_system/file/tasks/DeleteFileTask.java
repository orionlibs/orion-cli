package orioncli.core.file_system.file.tasks;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class DeleteFileTask
{
    public static void run(File filePathToDelete) throws IOException
    {
        try
        {
            FileUtils.forceDelete(filePathToDelete);
        }
        catch(Exception e)
        {
        }
    }


    public static void run(String filePathToDelete) throws IOException
    {
        run(new File(filePathToDelete));
    }
}