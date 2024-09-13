package org.cityevents;

import org.springframework.boot.SpringApplication;

public class TestCityEventsApplication {

	public static void main(String[] args) {
		SpringApplication.from(CityEventsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
