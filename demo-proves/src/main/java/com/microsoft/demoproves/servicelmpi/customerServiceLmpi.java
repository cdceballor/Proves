package com.microsoft.demoproves.servicelmpi;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microsoft.demoproves.entities.customer;
import com.microsoft.demoproves.repository.customerRepositiry;
import com.microsoft.demoproves.services.customerService;

@Service
public class customerServiceLmpi implements customerService{
    @Autowired
    customerRepositiry customerRepositiry;

    @Override
    public List<customer> findAllCustomers() {
        return customerRepositiry.findAll();
    }

    @Override
    public Optional<customer> findCustomersById(Long id) {
        Optional<customer> customer = customerRepositiry.findById(id);
        return customer;
    }

    @Override
    public customer saveCustomer(customer customerNew) {
    	if (customerNew != null) {
            return customerRepositiry.save(customerNew);
        }
        return new customer();
    }

    @Override
    public String deleteCustomer(Long id) {
    	if (customerRepositiry.findById(id).isPresent()) {
            customerRepositiry.deleteById(id);
            return "Customer eliminado correctamente.";
        }
        return "Error! El customer no existe";

    }
    @Override
    public String updateCustomer(customer customerUpdated) {
        Long num = customerUpdated.getId();
        if (customerRepositiry.findById(num).isPresent()) {
            customer customerToUpdate = new customer();
            customerToUpdate.setId(customerUpdated.getId());
            customerToUpdate.setName(customerUpdated.getName());
            customerToUpdate.setSurname(customerUpdated.getSurname());
            customerToUpdate.setBirtdate(customerUpdated.getBirtdate());
            customerToUpdate.setPhone(customerUpdated.getPhone());
            customerToUpdate.setCountry(customerUpdated.getCountry());
            customerToUpdate.setCity(customerUpdated.getCity());
            customerToUpdate.setDirection(customerUpdated.getDirection());
            customerToUpdate.setPostCode(customerUpdated.getPostCode());
            customerRepositiry.save(customerToUpdate);
            return "Customer modificado";
        }
        return "Error al modificar el Customer";
    }
}
