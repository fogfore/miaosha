package com.lingdian.service;

import com.lingdian.error.BusinessException;
import com.lingdian.service.model.OrderModel;

public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}
