package com.example.demo.infra.risk.api;

import com.example.demo.infra.risk.bo.CheckRiskResultBo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.common.Result;
import com.example.demo.infra.risk.bo.CheckResultParamBo;

@Tag(name = "RiskApi", description = "")
@FeignClient("infra-risk-service")
public interface RiskApi {
	@Operation(summary = "checkRisk", description = "")
	@PostMapping("/checkRisk")
	public Result<CheckRiskResultBo> checkRisk(@RequestBody CheckResultParamBo checkResultParamBo);
}
