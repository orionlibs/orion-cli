package orioncli.core.cryptology.hashing;

import orioncli.core.OrionEnumeration;

public enum HashingAlgorithm implements OrionEnumeration
{
    MD5("MD5"),
    SHA1("SHA-1"),
    SHA256("SHA-256"),
    SHA512("SHA-512");
    private String name;


    private HashingAlgorithm(String name)
    {
        setName(name);
    }


    public static boolean valueExists(String other)
    {
        HashingAlgorithm[] values = values();
        for(HashingAlgorithm value : values)
        {
            if(value.get().equals(other))
            {
                return true;
            }
        }
        return false;
    }


    public static HashingAlgorithm getEnumForValue(String other)
    {
        HashingAlgorithm[] values = values();
        for(HashingAlgorithm value : values)
        {
            if(value.get().equals(other))
            {
                return value;
            }
        }
        return null;
    }


    @Override
    public String get()
    {
        return getName();
    }


    public String getName()
    {
        return this.name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    @Override
    public boolean is(OrionEnumeration other)
    {
        return other instanceof HashingAlgorithm && this == other;
    }


    @Override
    public boolean isNot(OrionEnumeration other)
    {
        return other instanceof HashingAlgorithm && this != other;
    }
}