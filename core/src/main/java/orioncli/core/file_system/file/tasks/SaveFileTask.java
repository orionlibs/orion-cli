package orioncli.core.file_system.file.tasks;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class SaveFileTask
{
    public static void run(MultipartFile file, File destinationFilePath) throws IOException
    {
        file.transferTo(destinationFilePath);
    }


    public static void run(MultipartFile file, String destinationFilePath) throws IOException
    {
        run(file, new File(destinationFilePath));
    }
}