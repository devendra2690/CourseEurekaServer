package io.courserepository.CourseEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CourseEurekaServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CourseEurekaServerApplication.class, args);
	}

}
