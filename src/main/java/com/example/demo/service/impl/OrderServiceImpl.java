package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "OrderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;//这里会报错，但是并不会影响

    @Override
    public List<Order> findAllOrder() {
        return orderMapper.selectAllOrder();
    }
}
