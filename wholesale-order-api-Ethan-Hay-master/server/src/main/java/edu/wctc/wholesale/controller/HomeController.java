package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.service.WholesaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private WholesaleOrderService wholesaleOrderService;

    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("orderList", wholesaleOrderService.getAllOrders());
        return "index";
    }
}
