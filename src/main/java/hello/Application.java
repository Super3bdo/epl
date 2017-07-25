package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}