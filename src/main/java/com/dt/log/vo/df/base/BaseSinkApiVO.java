package com.dt.log.vo.df.base;

public class BaseSinkApiVO {
	private String status;
	private String message;
	private Object requestJson;
	private String responseTime;
	private String requestTime_mine;
	private Long requestGap;
	private Object data;

	public BaseSinkApiVO() {
		super();
	}

	public BaseSinkApiVO(String status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public BaseSinkApiVO(String status, String message, Object requestJson, String responseTime,
			String requestTime_mine, Long requestGap, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.requestJson = requestJson;
		this.responseTime = responseTime;
		this.requestTime_mine = requestTime_mine;
		this.requestGap = requestGap;
		this.data = data;
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

	public Object getRequestJson() {
		return requestJson;
	}

	public void setRequestJson(Object requestJson) {
		this.requestJson = requestJson;
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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

}
