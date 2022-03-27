package com.example.demo.infra.order.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * order
 * @author 
 */
@Data
@TableName("order_order")
public class Order implements Serializable {
    @TableId(type = IdType.ASSIGN_ID)
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
     * 案件类型名称
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

    private Long createBy;

    private Date updateTime;

    private String updateByName;

    private Long updateBy;

    private String remark;

    private String delFlag;

    private static final long serialVersionUID = 1L;
}