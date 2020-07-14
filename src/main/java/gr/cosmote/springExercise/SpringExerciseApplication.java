package gr.cosmote.springExercise;

import gr.cosmote.springExercise.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringExerciseApplication.class, args);

		User user = (User)ctx.getBean("user");
		user.getVehicles().stream().forEach(v -> v.drive());


	}

}
