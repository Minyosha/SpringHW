package hw_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "patient")
    public Patient patient(){
        return new Patient("Ivan", 1);
    }
    @Bean(name = "patient2")
    public Patient patient2(){
        return new Patient("Ivan2", 2);
    }

    @Bean(name = "archive")
    public Archive archive(){
        return new Archive();
    }

    @Bean(name = "schedule")
    public  Schedule schedule(){
        return new Schedule();
    }
}