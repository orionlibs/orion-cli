package orioncli.application.command.math;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.math.RandomNumberGenerationService;

@ShellComponent
public class RandomNumberGeneratorCommands
{
    @ShellMethod(key = "math.random.from-0-to-1")
    public double generateRandomNumberFrom0To1()
    {
        return RandomNumberGenerationService.getRandomNumberFromZeroToOne();
    }


    @ShellMethod(key = "math.random.integer")
    public int generateRandomNumberInteger(@ShellOption(value = {"--max", "-m"}) int max)
    {
        return RandomNumberGenerationService.getRandomInteger(max);
    }


    @ShellMethod(key = "math.random.integer-except-0")
    public int generateRandomNumberIntegerExcept0(@ShellOption(value = {"--min"}) int min,
                    @ShellOption(value = {"--max"}) int max)
    {
        return RandomNumberGenerationService.getRandomIntegerExceptZero(min, max);
    }
}
