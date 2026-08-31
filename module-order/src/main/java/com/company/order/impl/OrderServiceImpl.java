package com.company.order.impl;

import com.company.api.order.OrderService;
import com.company.api.user.UserService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService
{

    @Override
    public String summary(String orderNo) {
        return "module-order summary:"+orderNo;
    }
}
