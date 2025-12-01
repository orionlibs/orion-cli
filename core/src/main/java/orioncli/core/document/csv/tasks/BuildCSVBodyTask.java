package orioncli.core.document.csv.tasks;

import java.util.List;
import orioncli.core.document.csv.CSVWriterService;

public class BuildCSVBodyTask
{
    public static String run(List<List<String>> entries)
    {
        String body = "";
        if(entries != null && !entries.isEmpty())
        {
            for(List<String> entry : entries)
            {
                for(int i = 0; i < entry.size(); i++)
                {
                    body += "\"";
                    body += CSVWriterService.sanitiseValue(entry.get(i)) + "\"";
                    if(i < entry.size() - 1)
                    {
                        body += ",";
                    }
                    else
                    {
                        body += "\n";
                    }
                }
            }
        }
        return body;
    }
}