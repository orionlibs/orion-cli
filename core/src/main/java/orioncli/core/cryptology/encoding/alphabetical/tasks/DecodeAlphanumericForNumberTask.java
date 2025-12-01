package orioncli.core.cryptology.encoding.alphabetical.tasks;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import orioncli.core.cryptology.encoding.alphabetical.AlphabeticalEncodingService;

public class DecodeAlphanumericForNumberTask
{
    public static String run(String data)
    {
        char[] chars = new char[data.length()];
        data.getChars(0, data.length(), chars, 0);
        char[] chars2 = new char[data.length()];
        int i = chars2.length - 1;
        for(char c : chars)
        {
            chars2[i--] = c;
        }
        Map<Character, BigInteger> dictMap = new HashMap<>();
        int j = 0;
        for(char c : AlphabeticalEncodingService.characters)
        {
            dictMap.put(c, new BigInteger("" + j++));
        }
        BigInteger bi = BigInteger.ZERO;
        BigInteger base = new BigInteger("" + AlphabeticalEncodingService.characters.length);
        int exponent = 0;
        for(char c : chars2)
        {
            BigInteger a = dictMap.get(c);
            BigInteger b = base.pow(exponent).multiply(a);
            bi = bi.add(new BigInteger("" + b));
            exponent++;
        }
        return bi.toString();
    }
}