package orioncli.core.file_system.file.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import orioncli.core.utils.OrionUtils;

public class ConvertFileToStringListTask
{
    public static List<String> run(BufferedReader input) throws IOException
    {
        List<String> fileLines = new ArrayList<>();
        String currentLine = null;
        try
        {
            while((currentLine = input.readLine()) != null)
            {
                fileLines.add(currentLine);
            }
        }
        finally
        {
            OrionUtils.closeResource(input);
        }
        return fileLines;
    }
}