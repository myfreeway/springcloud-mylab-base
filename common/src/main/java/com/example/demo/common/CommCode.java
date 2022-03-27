package com.example.demo.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Title:
 * @Description:
 * @Company:
 * @Author: jiangguifan
 * @Create: Date:2022年03月20日
 */
public enum CommCode implements Code {
	SUCCESS(10000000, "comm.success", "成功"),
	ERROR(10000001, "comm.error", "系统错误"),
	UNKNOW(10000002, "comm.unknow", "未知"),
	INTFR_INNER_INVOKE_ERROR(10000003, "comm.intfr.inner.invoke.error", "内部系统接口调用异常"),
	INTFR_OUTTER_INVOKE_ERROR(10000004, "comm.intfr.outter.invoke.error", "外部系统接口调用异常"),
	INTFR_FORBID_VISIT(10000005, "comm.intfr.forbid.visit", "该接口禁止访问"),
	INTFR_ADDRESS_INVALID(10000006, "comm.intfr.address.invalid", "接口地址无效"),
	INTFR_REQUEST_TIMEOUT(10000007, "comm.intfr.request.timeout", "接口请求超时"),
	INTFR_EXCEED_LOAD(10000008, "comm.intfr.exceed.load", "接口负载过高"),
	PARAM_IS_INVALID(10000501, "comm.param.is.invalid", "参数无效"),
	PARAM_IS_BLANK(10000502, "comm.param.is.blank", "参数为空"),
	PARAM_LENGTH_OVER(10000503, "comm.param.length.over", "参数长度过长"),
	INVLIDE_DATE_STRING(10000504, "comm.param.date.format.error", "输入日期格式不对"),
	USER_NOT_LOGIN(10001001, "comm.user.not_login", "用户未登录"),
	USER_LOGIN_ERROR(10001002, "comm.user.login.error", "账号不存在或密码错误"),
	USER_ACCOUNT_FORBIDDEN(10001003, "comm.user.account.forbidden", "账号已被禁用"),
	USER_NOT_EXIST(10001004, "comm.user.login.credential.existed", "用户不存在"),
	USER_LOGIN_CREDENTIAL_EXISTED(10001005, "comm.user.not.exist", "凭证已存在"),
	USER_LOGIN_TOKEN_EMPTY(10001006, "comm.user.login.token.empty", "登陆token为空"),
	USER_LOGIN_TOKEN_TIMEOUT(10001007, "comm.user.login.token.timeout", "token已过期"),
	TOKEN_ERROR(10001008, "comm.user.token.error", "该Token无效"),
	USER_NO_PERMISSION(10001009, "comm.user.no.permission", "没有访问该资源的权限"),
	USER_NO_PERMISSION_FORMAT(10001010, "comm.user.no.permission.format", "没有访问{0}资源的权限"),
	DATA_NOT_FOUND(10002001, "comm.data.not.found", "数据不存在"),
	DATA_IS_WRONG(10002002, "comm.data.is.wrong", "数据有误"),
	DATA_UPDATE_WRONG(10002003, "comm.data.update.wrong", "数据更新出错"),
	DATA_ALREADY_EXISTED(10002004, "comm.data.already.existed", "数据已存在"),
	DATA_SERIALIZE_ERROR(10002005, "comm.data.already.existed", "序列化失败"),
	DATA_UNSERIALIZE_ERROR(10002006, "comm.data.already.existed", "反序列化失败");
	
	private Integer code;
	private String name;
	private String message;
	
	private CommCode(Integer code, String name, String msg) {
		this.code = code;
		this.name = name;
		this.message = msg;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public Code setMessage(String message) {
		this.message = message;
		return this;
	}
	
	public String toString() {
		return String.valueOf(this.code);
	}
}
