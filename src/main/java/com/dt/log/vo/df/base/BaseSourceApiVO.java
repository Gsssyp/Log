package com.dt.log.vo.df.base;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class BaseSourceApiVO {
	private String requestId;
	private String requestTime;
	private String sysName;
	private String sysCode;
	private String orgCode;
	private String departCode;
	private String loginName;
	private String password;
	private String userName;
	private String IP;
	private Object requestJson;
	private Integer repeatSign;
	private String dataflowCode;
	private JSONArray fields;
	private JSONObject params;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public String getDataflowCode() {
		return dataflowCode;
	}

	public void setDataflowCode(String dataflowCode) {
		this.dataflowCode = dataflowCode;
	}

	public Integer getRepeatSign() {
		return repeatSign;
	}

	public void setRepeatSign(Integer repeatSign) {
		this.repeatSign = repeatSign;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Object getRequestJson() {
		return requestJson;
	}

	public void setRequestJson(Object requestJson) {
		this.requestJson = requestJson;
	}

	public String getDepartCode() {
		return departCode;
	}

	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public JSONArray getFields() {
		return fields;
	}

	public void setFields(JSONArray fields) {
		this.fields = fields;
	}

	public JSONObject getParams() {
		return params;
	}

	public void setParams(JSONObject params) {
		this.params = params;
	}

}
