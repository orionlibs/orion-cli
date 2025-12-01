package orioncli.core.file_system.file.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.StandardCopyOption;

public class MoveFileTask
{
    public static void run(File filePathToMove, File destinationFilePath) throws InvalidPathException, IOException
    {
        CopyOption[] copyOptions = new CopyOption[2];
        copyOptions[0] = StandardCopyOption.REPLACE_EXISTING;
        copyOptions[1] = StandardCopyOption.COPY_ATTRIBUTES;
        Files.move(filePathToMove.toPath(), destinationFilePath.toPath(), copyOptions);
    }


    public static void run(String filePathToMove, String destinationFilePath) throws InvalidPathException, IOException
    {
        run(new File(filePathToMove), new File(destinationFilePath));
    }


    public static void run(File filePathToMove, String destinationFilePath) throws InvalidPathException, IOException
    {
        run(filePathToMove, new File(destinationFilePath));
    }


    public static void run(String filePathToMove, File destinationFilePath) throws InvalidPathException, IOException
    {
        run(new File(filePathToMove), destinationFilePath);
    }
}