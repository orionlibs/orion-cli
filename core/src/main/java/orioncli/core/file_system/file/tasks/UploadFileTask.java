package orioncli.core.file_system.file.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.web.multipart.MultipartFile;

public class UploadFileTask
{
    public static void run(MultipartFile fileToUpload, String filePathToDownloadTo, String fileName) throws IOException
    {
        Path documentsPath = Paths.get(filePathToDownloadTo);
        Files.copy(fileToUpload.getInputStream(), documentsPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
    }
}