
package com.dt.log.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "log_dflog")
public class DFLog {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
	private String id;
	// source
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
	@Lob
	private String sourceRequestJson;
	private Integer repeatSign;
	private String dataflowCode;
	@Lob
	private String fields;
	@Lob
	private String params;
	
	// sink
	private String status;
	private String message;
	@Lob
	private String sinkRequestJson;
	private String responseTime;
	private String requestTime_mine;
	private Long requestGap;
	@Lob
	private String data;
	
	public DFLog() {
		super();
	}
	
	public DFLog(String requestId, String requestTime, String sysName, String sysCode, String orgCode,
			String departCode, String loginName, String password, String userName, String iP, String sourceRequestJson,
			Integer repeatSign, String dataflowCode, String fields, String params, String status, String message,
			String sinkRequestJson, String responseTime, String requestTime_mine, Long requestGap, String data) {
		super();
		this.requestId = requestId;
		this.requestTime = requestTime;
		this.sysName = sysName;
		this.sysCode = sysCode;
		this.orgCode = orgCode;
		this.departCode = departCode;
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
		IP = iP;
		this.sourceRequestJson = sourceRequestJson;
		this.repeatSign = repeatSign;
		this.dataflowCode = dataflowCode;
		this.fields = fields;
		this.params = params;
		this.status = status;
		this.message = message;
		this.sinkRequestJson = sinkRequestJson;
		this.responseTime = responseTime;
		this.requestTime_mine = requestTime_mine;
		this.requestGap = requestGap;
		this.data = data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getSourceRequestJson() {
		return sourceRequestJson;
	}
	public void setSourceRequestJson(String sourceRequestJson) {
		this.sourceRequestJson = sourceRequestJson;
	}
	public Integer getRepeatSign() {
		return repeatSign;
	}
	public void setRepeatSign(Integer repeatSign) {
		this.repeatSign = repeatSign;
	}
	public String getDataflowCode() {
		return dataflowCode;
	}
	public void setDataflowCode(String dataflowCode) {
		this.dataflowCode = dataflowCode;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSinkRequestJson() {
		return sinkRequestJson;
	}
	public void setSinkRequestJson(String sinkRequestJson) {
		this.sinkRequestJson = sinkRequestJson;
	}
	public String getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}
	public String getRequestTime_mine() {
		return requestTime_mine;
	}
	public void setRequestTime_mine(String requestTime_mine) {
		this.requestTime_mine = requestTime_mine;
	}
	public Long getRequestGap() {
		return requestGap;
	}
	public void setRequestGap(Long requestGap) {
		this.requestGap = requestGap;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

}
