package com.example.demo.common;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
public interface Code {
	int COMM_BASE = 10000000;
	int MODULE_INTER_INC = 10000;
	int MODULE_INNER_INC = 500;

	static Code newInstance(final Integer code, final String name, final String message) {
		return new Code() {
			@Override
			public Integer getCode() {
				return code;
			}

			@Override
			public String getMessage() {
				return message;
			}

			@Override
			public String getName() {
				return name;
			}
		};
	}

	Integer getCode();

	String getName();

	String getMessage();
}
