package com.dt.log.biz;

import com.dt.log.entity.DFLog;

public interface IDFLogService {
	DFLog save(DFLog log);
	DFLog get(String id);
}
