package orioncli.core.file_system.file.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import orioncli.core.utils.OrionUtils;

public class ConvertFileToStringTask
{
    public static String run(BufferedReader input) throws IOException
    {
        String currentLine = null;
        StringBuilder fileStringBuilder = new StringBuilder();
        try
        {
            while((currentLine = input.readLine()) != null)
            {
                fileStringBuilder.append(currentLine);
                fileStringBuilder.append(System.lineSeparator());
            }
        }
        finally
        {
            OrionUtils.closeResource(input);
        }
        return fileStringBuilder.toString();
    }
}