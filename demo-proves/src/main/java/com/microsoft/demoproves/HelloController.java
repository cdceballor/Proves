package com.microsoft.demoproves;
import java.util.Optional;
import java.util.List;
import com.microsoft.demoproves.entities.customer;
/**
import com.microsoft.demoproves.classes.information.info;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "First step with Spring";
    }

    @RequestMapping("/info")
    public String info() {
        return info.name();
    }
}
 */
/**
 * HelloController
 */
public interface HelloController {
    //Doing the same thing that in Service but now in the Controller 'cause here we going to redirect all the information (CRUD)
    	public List<customer> getCustomers();
        public Optional<customer> getCustomerById(Long id);
        public customer addCustomer(customer customer);
        public String deleteCustomer(Long id);
        public String updateCustomer(customer customerNew);
        public String test();
        public String error();
        public String index();
}
