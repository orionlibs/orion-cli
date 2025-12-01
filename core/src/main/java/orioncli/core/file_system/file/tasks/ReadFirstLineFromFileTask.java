package orioncli.core.file_system.file.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import orioncli.core.utils.OrionUtils;

public class ReadFirstLineFromFileTask
{
    public static String run(BufferedReader input) throws IOException
    {
        try
        {
            return input.readLine();
        }
        finally
        {
            OrionUtils.closeResource(input);
        }
    }
}