package com.example.demo.infra.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * CreateOrderBo模型
 * @author 
 */
@Data
@Schema(name = "CreateOrderBo模型")
public class CreateOrderBo implements Serializable {
    /**
     * @Schema useiddd
     */
    private Long userId;

    /**
     * 订单号
     */
    @Schema(name = "orderNo",description = "订单号")
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

    private static final long serialVersionUID = 1L;
}