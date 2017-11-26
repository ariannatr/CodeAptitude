package dearpet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Component
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	/**Define Url Pages **/
	@Override
	public void addViewControllers(ViewControllerRegistry registry)
	{
		registry.addViewController("/").setViewName("/index");
		registry.addViewController("/index").setViewName("/index");
		registry.addViewController("/admin").setViewName("/admin");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/about").setViewName("/about");
		registry.addViewController("/grooming").setViewName("/associate");
		registry.addViewController("/doctor").setViewName("/associate");
		registry.addViewController("/profile").setViewName("/profile");
		registry.addViewController("/search/**").setViewName("/associate");
		registry.addViewController("/alllost").setViewName("/lost");
	}
}