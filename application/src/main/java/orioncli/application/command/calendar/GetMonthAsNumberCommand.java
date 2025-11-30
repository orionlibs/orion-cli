package orioncli.application.command.calendar;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import orioncli.core.calendar.Calendar;

@ShellComponent
public class GetMonthAsNumberCommand
{
    @ShellMethod(key = "calendar.month.as-number")
    public int calendarMonthAsNumber(@ShellOption(value = {"--month", "-m"}) String month)
    {
        return Calendar.monthFullNameToNumberMapper.get(month);
    }
}
