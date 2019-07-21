package com.example.demo.Controller;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/Order/")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "all")
    public List<Order> findAllOrder() {

        return orderService.findAllOrder();
    }
}
