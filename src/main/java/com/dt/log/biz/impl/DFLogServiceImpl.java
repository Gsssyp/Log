package com.dt.log.biz.impl;

import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.dt.log.biz.IDFLogService;
import com.dt.log.entity.DFLog;
import com.dt.log.repository.DFLogRepository;

@Service
@Transactional
public class DFLogServiceImpl implements IDFLogService{
	@Resource
	DFLogRepository dfLogRepository;
	
	@Override
	public DFLog save(DFLog log) {
		DFLog obj = dfLogRepository.save(log);
		return obj;
	}
	
	@Override
	public DFLog get(String id) {
		Optional<DFLog> findById = dfLogRepository.findById(id);
		DFLog dfLog = findById.orElse(null);
		return dfLog;
	}
}
