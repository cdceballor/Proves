package com.microsoft.demoproves.repository;

//Repository layout
import java.util.Optional;
/**
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
*/
import org.springframework.data.jpa.repository.JpaRepository;
import com.microsoft.demoproves.entities.customer;
//Create an interface file 
/** 
@ComponentScan({"com.delivery.request"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableJpaRepositories("seconds47.repository")
*/
public interface customerRepositiry extends JpaRepository<customer, Long>{
    Void save(Optional<customer> customerToUpdate);
}
