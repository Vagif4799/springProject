package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * http://localhost:8080/users
 */

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
}
