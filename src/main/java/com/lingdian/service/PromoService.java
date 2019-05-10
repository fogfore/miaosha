package com.lingdian.service;

import com.lingdian.service.model.PromoModel;

public interface PromoService {
    // 根据itemId获取即将进行或正在进行的促销活动
    PromoModel getPromoByItemId(Integer itemId);
}
