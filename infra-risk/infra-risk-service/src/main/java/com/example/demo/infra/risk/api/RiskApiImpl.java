package com.example.demo.infra.risk.api;

import cn.hutool.core.util.RandomUtil;
import com.example.demo.infra.risk.bo.CheckResultParamBo;
import com.example.demo.infra.risk.bo.CheckRiskResultBo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Result;

@RestController
@Slf4j
public class RiskApiImpl implements RiskApi {
	@Override
	public Result<CheckRiskResultBo> checkRisk(CheckResultParamBo checkResultParamBo) {
		CheckRiskResultBo checkRiskResultBo = new CheckRiskResultBo();
		long sleepMillis = RandomUtil.randomLong(100, 5000);
		try {
			log.info("开始休眠{}毫秒", sleepMillis);
			Thread.sleep(sleepMillis);
		} catch (InterruptedException e) {
		}
		checkRiskResultBo.setRisk(true);
		log.info("return checkRisk={}", checkRiskResultBo);
		return new Result<>(checkRiskResultBo);
	}
}
