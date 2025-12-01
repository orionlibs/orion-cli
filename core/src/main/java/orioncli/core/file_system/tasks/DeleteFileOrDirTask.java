package orioncli.core.file_system.tasks;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class DeleteFileOrDirTask
{
    public static void run(File fileToDelete) throws IOException
    {
        if(fileToDelete.exists())
        {
            FileUtils.forceDelete(fileToDelete);
        }
    }


    public static void run(String filepath) throws IOException
    {
        run(new File(filepath));
    }


    public static void run(String directoryInWhichFileToDeleteExists, boolean checkIfFileStartsWithPattern, String fileStartsWithPattern) throws IOException
    {
        File directoryName = new File(directoryInWhichFileToDeleteExists);
        if(directoryName.exists())
        {
            File[] files = directoryName.listFiles();
            if(files != null && files.length > 0)
            {
                for(File file : files)
                {
                    if(checkIfFileStartsWithPattern)
                    {
                        if(file.getName().startsWith(fileStartsWithPattern))
                        {
                            run(file);
                        }
                    }
                    else
                    {
                        run(file);
                    }
                }
            }
        }
    }
}