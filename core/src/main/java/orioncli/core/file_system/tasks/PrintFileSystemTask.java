package orioncli.core.file_system.tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintFileSystemTask
{
    public static BufferedWriter run(String directoryPathToTraverse, String filePathToSaveIn) throws IOException
    {
        BufferedWriter output = new BufferedWriter(new FileWriter(filePathToSaveIn));
        File file = new File(directoryPathToTraverse);
        PrintFilesAndDirectoriesTask.run(file, output);
        return output;
    }
}