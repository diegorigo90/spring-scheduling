package it.diegorigo.scheduled;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static it.diegorigo.scheduled.Constants.INITIAL_DELAY;

@SpringBootApplication
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
        System.out.println("Waiting for " + INITIAL_DELAY / 1000 + " seconds before starting...");
    }

}
