package it.diegorigo.scheduled;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import static it.diegorigo.scheduled.Constants.*;

@Configuration
@EnableScheduling
public class MyConfiguration {

    @Scheduled(initialDelay = INITIAL_DELAY, fixedDelay = FIXED_DELAY)
    public void scheduledTask() {
        System.out.println("Doing scheduled task at fixed rate (every " + FIXED_DELAY / 1000 + " seconds)");
    }
}
