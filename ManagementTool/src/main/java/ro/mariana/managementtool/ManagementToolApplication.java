package ro.mariana.managementtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"ro.mariana.domain"}) //needed to create automatically the tables
public class ManagementToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementToolApplication.class, args);
    }

}
