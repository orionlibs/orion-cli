package orioncli.core.cryptology.hashing.md5.tasks;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import orioncli.core.cryptology.hashing.HashingAlgorithm;

public class EncodeToMD5Task
{
    public static byte[] run(String data, int offset, int length, byte[] signatureKeyBytes) throws NoSuchAlgorithmException
    {
        MessageDigest md5Digest = MessageDigest.getInstance(HashingAlgorithm.MD5.get());
        //Secret key bytes first
        md5Digest.update(signatureKeyBytes);
        //Data second
        md5Digest.update(data.getBytes(), offset, length);
        //Generate the digest
        return md5Digest.digest();
    }


    public static byte[] run(String data) throws NoSuchAlgorithmException
    {
        MessageDigest md5Digest = MessageDigest.getInstance(HashingAlgorithm.MD5.get());
        md5Digest.update(data.getBytes());
        return md5Digest.digest();
    }
}