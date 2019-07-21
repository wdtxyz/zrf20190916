package com.example.demo.model;

import java.util.Date;

public class Order {
    private Integer quantity;

    private String orderId;

    private String clientId;

    private Date orderDate;

    private String commont;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCommont() {
        return commont;
    }

    public void setCommont(String commont) {
        this.commont = commont == null ? null : commont.trim();
    }
}
