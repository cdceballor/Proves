package com.microsoft.demoproves.shotterController;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.microsoft.demoproves.HelloController;
import com.microsoft.demoproves.entities.customer;
import com.microsoft.demoproves.services.customerService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Mapping all the urls
@RequestMapping("/api/example")
public class customerControllerLmpl implements HelloController {
		
		@GetMapping("/hello-world")
		public ResponseEntity<String> get() {
			return ResponseEntity.ok("Hello World!");
		}
	
    @Autowired
    customerService customerService;

    // http://localhost:8888/customers (GET)
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<customer> getCustomers() {
        return customerService.findAllCustomers();
    }

    // http://localhost:8888/customers/1 (GET)
    @Override
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<customer> getCustomerById(@PathVariable Long id) {
        return customerService.findCustomersById(id);
    }

    // http://localhost:8888/customers/add (ADD)
    @Override
    @RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
    public customer addCustomer(customer customer) {
        return customerService.saveCustomer(customer);
    }

    // http://localhost:8888/customers/delete/1 (GET)
    @Override
    @RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    // http://localhost:8888/customers/update (PATCH)
    @Override
    @RequestMapping(value = "/customers/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateCustomer(customer customerNew) {
        return customerService.updateCustomer(customerNew);
    }

    // http://localhost:8888/test (GET)
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String test() {
        return "Test done";
    }
    
    @RequestMapping(value = "/error", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String error() {
        return "Error running the application";
    }
    
    @RequestMapping("/")
    @Override
    public String index() {
        return "Welcome to Spring";
        }
}