package com.dt.log.frame.kafka;

import javax.annotation.Resource;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.dt.log.biz.IDFLogService;
import com.dt.log.entity.DFLog;
import com.dt.log.vo.df.base.BaseSinkApiVO;
import com.dt.log.vo.df.base.BaseSourceApiVO;
import com.dt.log.vo.df.log.DFLogApiVO;



@Component
public class KafkaConsumer {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	private IDFLogService dfLogService;
	
	 @KafkaListener(topics = {"${log.df-kafkaconsumer.topic}"})
     public void listen (ConsumerRecord<?, ?> record, Acknowledgment acknowledgment, Consumer<?, ?> consumer){
		try {
			String logStr = (String) record.value();
			DFLogApiVO logVO = JSON.parseObject(logStr, DFLogApiVO.class);
			DFLog log = dfLogApiVOToDFLog(logVO);
			dfLogService.save(log);
			acknowledgment.acknowledge();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("kafka消息消费失败", e);
		}
     }
	 
	 /**
	  * 将VO转换成PO
	  * @param vo
	  * @return
	  */
	 private DFLog dfLogApiVOToDFLog(DFLogApiVO vo) {
		BaseSourceApiVO sourceLog = vo.getSource();
	 	BaseSinkApiVO sinkLog = vo.getSink();
	 	DFLog result = new DFLog(sourceLog.getRequestId(), sourceLog.getRequestTime(), sourceLog.getSysCode(), sourceLog.getSysCode(), sourceLog.getOrgCode(), sourceLog.getDepartCode(), sourceLog.getLoginName(), sourceLog.getPassword(), sourceLog.getUserName(), sourceLog.getIP(), sourceLog.getRequestJson()!=null?sourceLog.getRequestJson().toString():null, sourceLog.getRepeatSign(), sourceLog.getDataflowCode(), sourceLog.getFields()!=null?sourceLog.getFields().toJSONString():null, sourceLog.getParams()!=null?sourceLog.getParams().toJSONString():null, sinkLog.getStatus(), sinkLog.getMessage(), sinkLog.getRequestJson()!=null?sinkLog.getRequestJson().toString():"", sinkLog.getResponseTime(), sinkLog.getRequestTime_mine(), sinkLog.getRequestGap(), sinkLog.getData()!=null?sinkLog.getData().toString():"");
	 	return result;
	 }
	 
	 
	 
}
