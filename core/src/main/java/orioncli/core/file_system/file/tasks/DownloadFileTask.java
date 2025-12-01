package orioncli.core.file_system.file.tasks;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import orioncli.core.file_system.file.FileService;
import orioncli.core.utils.OrionUtils;

public class DownloadFileTask
{
    public static void run(String URLResourceToDownload, String filePathToDownloadTo) throws IOException
    {
        BufferedInputStream input = FileService.downloadFileAsStream(URLResourceToDownload);
        ByteArrayOutputStream output = null;
        OutputStream fos = null;
        try
        {
            output = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while((n = input.read(buf)) != -1)
            {
                output.write(buf, 0, n);
            }
            fos = Files.newOutputStream(Paths.get(filePathToDownloadTo));
            fos.write(output.toByteArray());
        }
        finally
        {
            OrionUtils.closeResource(input);
            OrionUtils.closeResource(output);
            OrionUtils.closeResource(fos);
        }
    }
}