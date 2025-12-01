package orioncli.core.cryptology.encoding.ascii.tasks;

public class EncodeToASCIITask
{
    public static String run(String data)
    {
        String ASCIIData = "";
        if(!data.isEmpty())
        {
            for(int i = 0; i < data.length(); i++)
            {
                if(data.charAt(i) == ' ')
                {
                    ASCIIData += " ";
                }
                else
                {
                    ASCIIData += "" + (int)data.charAt(i);
                }
                if(i < data.length() - 1)
                {
                    ASCIIData += "_";
                }
            }
        }
        return ASCIIData;
    }
}