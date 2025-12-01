package orioncli.core.file_system.file.tasks;

import java.io.File;
import java.io.IOException;

public class CreateFileTask
{
    public static boolean run(File directory) throws IOException
    {
        return directory.createNewFile();
    }


    public static boolean run(String directory) throws IOException
    {
        return run(new File(directory));
    }
}