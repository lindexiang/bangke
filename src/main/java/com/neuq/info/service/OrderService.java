package com.neuq.info.service;

import com.neuq.info.common.Enum.OrderEnum;
import com.neuq.info.dao.OrderDao;
import com.neuq.info.dto.ResultModel;
import com.neuq.info.entity.Order;
import com.neuq.info.entity.User;
import org.aspectj.weaver.ast.Or;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public int createOrder(Order order) {
        return orderDao.insert(order);
    }

    public int editOrder(Order order) {
        return orderDao.updateByOrderId(order);
    }

    public Order findOrderByOrderId(String orderId) {
        Order order = orderDao.selectByOrderId(orderId);
        return order;
    }

    public int DeleteOrder(String orderId) {
        return orderDao.deleteByOrderId(orderId);
    }

    public List<Order> listOrderForUser(HashMap conditionMap) {
        List<Order> orders = orderDao.listOrderByCondition(conditionMap);
        return orders;
    }

    public List<Order> queryAll(Order order) {
        return orderDao.queryAll(order);
    }

    //TODO
    public void cancelOrder(Order order) {
        order.setOrderStatus(OrderEnum.YqxOrderStatus.getValue());
        orderDao.updateByOrderId(order);
    }

}


