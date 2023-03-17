package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.exception.ResourceNotFoundException;
import edu.wctc.wholesale.repository.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WholesaleOrderService {
    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;
    public WholesaleOrder getOrder(int id) throws ResourceNotFoundException{
        return wholesaleOrderRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Order","id",id));
    }
    public List<WholesaleOrder> getAllOrders(){
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(list::add);
        return list;
    }
}
