package Main;

import java.time.Duration;
import java.time.LocalDateTime;

public class Time {
    private Duration addedTime;

    public Time() {
        this.addedTime = Duration.ZERO;
    }

    public LocalDateTime getSystemTime() {
        return LocalDateTime.now().plus(addedTime);
    }

    public void addDay(int daysToAdd) {
        this.addedTime = this.addedTime.plusDays(daysToAdd);
    }


}
