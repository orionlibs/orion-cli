package orioncli.core.file_system.tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class PrintFilesAndDirectoriesTask
{
    public static void run(File directoryToTraverse, BufferedWriter output) throws IOException
    {
        output.write(directoryToTraverse.getAbsolutePath());
        output.write(System.lineSeparator());
        if(directoryToTraverse.isDirectory())
        {
            File[] filesTemp = directoryToTraverse.listFiles();
            for(File file1 : filesTemp)
            {
                run(file1, output);
            }
        }
    }
}