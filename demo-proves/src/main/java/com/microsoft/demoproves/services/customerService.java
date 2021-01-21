package com.microsoft.demoproves.services;

import java.util.List;
import java.util.Optional;
import com.microsoft.demoproves.entities.customer;
//We need this method to work later, for example: to call this methods in other case
public interface customerService {

    public List<customer> findAllCustomers();
    public Optional<customer> findCustomersById(Long id);

    public customer saveCustomer(customer customerNew);
    public String deleteCustomer(Long id);
    public String updateCustomer(customer customerNew);
}
