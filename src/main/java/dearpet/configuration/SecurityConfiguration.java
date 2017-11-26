package dearpet.configuration;


import dearpet.authentication.MyDBAythenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@ComponentScan
@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private MyDBAythenticationService myDBAythenticationService;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myDBAythenticationService).passwordEncoder(bCryptPasswordEncoder);
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests()
                .antMatchers("/").permitAll()
				.antMatchers("/index").permitAll()
                .antMatchers("/login").anonymous()
				.antMatchers("/about").permitAll()
				.antMatchers("/error").permitAll()
				.antMatchers("/request").permitAll()
				.antMatchers("/grooming").permitAll()
				.antMatchers("/doctor").permitAll()
                .antMatchers("/gallery").permitAll()
				.antMatchers("/associate").permitAll()
                .antMatchers("/error").permitAll()
				.antMatchers("/profile").permitAll()
				.antMatchers("/lost").permitAll()
				.anyRequest().authenticated().and().anonymous().and()
                .csrf().disable()
                .formLogin()
				.loginPage("/index")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureUrl("/index?success=false")
                .defaultSuccessUrl("/index")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/index").and().exceptionHandling();
				//.accessDeniedPage("/error");
        http.sessionManagement()//now added
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .maximumSessions(2)
                .expiredUrl("/index");
        http.sessionManagement()
                .invalidSessionUrl("/index")
                .sessionFixation().migrateSession();
	}

    @Bean//lately added
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }


	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring()
	       .antMatchers(/*"/fragments/**",*/"/resources/**","/static/**","/static/js/**", "/css/**", "/js/**", "/images/**","/scripts/**","/vendor/**","/fonts/**");
	}
}