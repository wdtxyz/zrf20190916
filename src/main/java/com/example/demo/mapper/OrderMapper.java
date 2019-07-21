package com.example.demo.mapper;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> selectAllOrder();
}