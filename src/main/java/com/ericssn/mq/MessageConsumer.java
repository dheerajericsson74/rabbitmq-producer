package com.ericssn.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	
	
	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(CustomMessage msg) {
		
		System.out.println(" --> "+msg);
	}

}
