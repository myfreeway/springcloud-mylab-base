package com.example.demo.agg.core;

import feign.RetryableException;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Title: 最大重试次数2次，包含首次调用。重试间隔在[100ms, 1000ms]之间随机
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年04月09日
 */
@Slf4j
public class MyRetryer implements Retryer {
	@Override
	public void continueOrPropagate(RetryableException e) {
		log.info("Feign retry attempt due to {} ", e.getMessage());
		throw e;
	}

	@Override
	public Retryer clone() {
		return new Default(100, TimeUnit.SECONDS.toMillis(1), 2);
	}
}
