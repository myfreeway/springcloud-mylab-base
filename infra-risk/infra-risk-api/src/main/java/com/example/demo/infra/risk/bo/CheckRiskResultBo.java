package com.example.demo.infra.risk.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class CheckRiskResultBo implements Serializable {
    private Boolean risk;

    private static final long serialVersionUID = 1L;
}