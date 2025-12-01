package orioncli.core.utils;

import java.io.Closeable;
import java.io.IOException;

public class OrionUtils
{
    public static boolean closeResource(Closeable closeable)
    {
        try
        {
            closeable.close();
            return true;
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }


    public static int getBooleanAsInteger(boolean x)
    {
        return (x) ? 1 : 0;
    }


    public static int getBooleanAsInteger(Boolean x)
    {
        return (x) ? 1 : 0;
    }
}