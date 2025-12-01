package orioncli.core.cryptology.encoding.xss;

import orioncli.core.cryptology.encoding.xss.tasks.DecodeFromXSSTask;
import orioncli.core.cryptology.encoding.xss.tasks.EncodeWithXSSTask;

public class XSSEncodingService
{
    public static String encodeWithXSS(String data)
    {
        return EncodeWithXSSTask.run(data);
    }


    public static String decodeFromXSS(String data)
    {
        return DecodeFromXSSTask.run(data);
    }
}