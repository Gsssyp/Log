package com.dt.log.vo.df.log;

import com.dt.log.vo.df.base.BaseSinkApiVO;
import com.dt.log.vo.df.base.BaseSourceApiVO;

public class DFLogApiVO {
	
	private BaseSourceApiVO source;
	private BaseSinkApiVO sink;
	
	public BaseSourceApiVO getSource() {
		return source;
	}
	public void setSource(BaseSourceApiVO source) {
		this.source = source;
	}
	public BaseSinkApiVO getSink() {
		return sink;
	}
	public void setSink(BaseSinkApiVO sink) {
		this.sink = sink;
	}
	
}
