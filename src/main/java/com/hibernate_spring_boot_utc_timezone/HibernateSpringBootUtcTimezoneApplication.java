package com.hibernate_spring_boot_utc_timezone;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate_spring_boot_utc_timezone.service.ScreenshotService;

@SpringBootApplication
public class HibernateSpringBootUtcTimezoneApplication {

	private final ScreenshotService screenshotService;
	
	public HibernateSpringBootUtcTimezoneApplication(ScreenshotService screenshotService) {
        this.screenshotService = screenshotService;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringBootUtcTimezoneApplication.class, args);
	}
	
	@Bean
    public ApplicationRunner init() {
        return args -> {
            screenshotService.saveScreenshotInUTC();
            screenshotService.displayScreenshotInUTC();
        };
    }

}
