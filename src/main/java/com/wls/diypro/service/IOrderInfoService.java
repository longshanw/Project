package com.wls.diypro.service;

import com.wls.diypro.model.MPOrderInfo;
import com.wls.diypro.model.OrderInfo;

import java.util.List;

/**
 * Created by wls on 2017/8/5.
 */
public interface IOrderInfoService {

    /**
     * 获取订单集合
     * @return
     * @throws Exception
     */
     public List<OrderInfo> getOrders() throws Exception;

     public OrderInfo addOrder(OrderInfo orderInfo) throws Exception;

     public OrderInfo updateOrder(Integer id,OrderInfo orderInfo) throws Exception;

     public void deleteOrder(Integer id) throws Exception;

     void addOrderTrans() throws Exception;

     public void getStatus(Integer id) throws Exception;

     MPOrderInfo findOne(Integer id) throws Exception;
}