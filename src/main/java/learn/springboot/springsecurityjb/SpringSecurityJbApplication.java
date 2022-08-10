package learn.springboot.springsecurityjb;

import learn.springboot.springsecurityjb.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJbApplication.class, args);
    }

}
