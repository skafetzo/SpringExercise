package gr.cosmote.springExercise.config;

import gr.cosmote.springExercise.Vehicle;
import gr.cosmote.springExercise.entities.Car;
import gr.cosmote.springExercise.entities.MotorBike;
import gr.cosmote.springExercise.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CoreConfiguration {


    @Bean(name = "motorbike")
    public MotorBike getBike() {
        return new MotorBike();
    }


    @Bean(name = "car")
    public Car getCar() {
        return new Car();}

    @Bean(name = "user")
    public User getUser(){
        User user = new User();
        List<Vehicle> myList = new ArrayList(List.of(getBike(),getCar()));
        user.setVehicles(myList);
        return user;
    }


}
