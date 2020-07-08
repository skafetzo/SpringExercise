package gr.cosmote.springExercise.config;

import gr.cosmote.springExercise.entities.Car;
import gr.cosmote.springExercise.entities.MotorBike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("gr.cosmote.springExercise.entities")
public class CoreConfiguration {


    @Bean(name = "motorbike")
    public MotorBike getBike() {
        return new MotorBike();
    }


    @Bean(name = "mycar")
    public Car getCar() { return new Car();}

}
