package dearpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Arianna on 25/11/2017.
 */

@SpringBootApplication
@Configuration
//@EnableAutoConfiguration
//@EnableWebSecurity
@ComponentScan
public class DearpetApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DearpetApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DearpetApplication.class, args);
    }

}
