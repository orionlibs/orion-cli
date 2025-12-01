package orioncli.core.cryptology.hashing.md5;

import java.security.NoSuchAlgorithmException;
import orioncli.core.cryptology.hashing.md5.tasks.EncodeToMD5Task;

public class MD5HashingService
{
    public static byte[] encodeToMD5AsBytes(String data, int offset, int length, byte[] signatureKeyBytes) throws NoSuchAlgorithmException
    {
        return EncodeToMD5Task.run(data, offset, length, signatureKeyBytes);
    }


    public static String encodeToMD5(String data, int offset, int length, byte[] signatureKeyBytes) throws NoSuchAlgorithmException
    {
        return new String(EncodeToMD5Task.run(data, offset, length, signatureKeyBytes));
    }


    public static byte[] encodeToMD5AsBytes(String data) throws NoSuchAlgorithmException
    {
        return EncodeToMD5Task.run(data);
    }


    public static String encodeToMD5(String data) throws NoSuchAlgorithmException
    {
        return new String(EncodeToMD5Task.run(data));
    }
}