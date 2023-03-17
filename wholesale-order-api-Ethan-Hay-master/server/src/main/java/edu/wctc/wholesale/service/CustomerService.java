package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository custRepo;

    public Customer getCustomer(int id) throws ResourceNotFoundException{
        return custRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Customer","id",id));
    }
    public List<Customer> getAllCustomers(){
        List<Customer> list = new ArrayList<>();
        custRepo.findAll().forEach(list::add);
        return list;
    }
}
