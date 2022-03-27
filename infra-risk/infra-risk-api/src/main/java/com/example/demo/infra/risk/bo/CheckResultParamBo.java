package com.example.demo.infra.risk.bo;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CheckResultParamBo implements Serializable {
    /**
     * useid
     */
    private Long userId;
    
    /**
     * 收货人电话
     */
    private String receiverTel;

    /**
     * 收货人地址
     */
    private String receiverAddr;

    private static final long serialVersionUID = 1L;
}