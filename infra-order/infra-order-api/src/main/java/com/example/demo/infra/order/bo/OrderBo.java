package com.example.demo.infra.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 订单BO模型
 * @author 
 */
@Data
public class OrderBo implements Serializable {
    private Long id;

    /**
     * useid
     */
    private Long userId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单标题
     */
    private String orderTitle;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 商品名
     */
    private String goodsName;

    /**
     * 商品数量
     */
    private Integer goodsQuanlity;

    /**
     * 商品单价
     */
    private BigDecimal goodsUnitPrice;

    /**
     * 收货人电话
     */
    private String receiverTel;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人地址
     */
    private String receiverAddr;
    
    private Date createTime;
    
    private String createByName;
    
    private static final long serialVersionUID = 1L;
}