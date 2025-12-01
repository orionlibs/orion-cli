package orioncli.core.math;

import orioncli.core.math.tasks.GetRandomIntegerExceptZeroTask;
import orioncli.core.math.tasks.GetRandomNumberExceptZeroTask;

public class RandomNumberGenerationService
{
    public static double getRandomNumberFromZeroToOne()
    {
        return Math.random();
    }


    public static int getRandomInteger(int maximumNumber)
    {
        return (int)(Math.floor(Math.random() * maximumNumber));
    }


    public static double getRandomInteger(double maximumNumber)
    {
        return (int)(Math.floor(Math.random() * maximumNumber));
    }


    public static int getRandomIntegerExceptZero(int maximumNumber)
    {
        return GetRandomIntegerExceptZeroTask.run(maximumNumber);
    }


    public static double getRandomNumberExceptZero(double maximumNumber)
    {
        return GetRandomNumberExceptZeroTask.run(maximumNumber);
    }


    public static int getRandomIntegerExceptZero(int minimumNumber, int maximumNumber)
    {
        return GetRandomIntegerExceptZeroTask.run(minimumNumber, maximumNumber);
    }


    public static double getRandomNumberExceptZero(double minimumNumber, double maximumNumber)
    {
        return GetRandomNumberExceptZeroTask.run(minimumNumber, maximumNumber);
    }
}