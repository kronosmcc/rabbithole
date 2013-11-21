package com.mcc.rabbit.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Spring AMQP Message Listener which responds to requests for a Person.
 * @author michael.clark
 *
 */
public class GetPersonRequestListener implements MessageListener{

	private static final Logger logger = LoggerFactory.getLogger(GetPersonRequestListener.class);
	
	public void onMessage( Message message ){
		logger.info("Message detected on Queue: personGetRequestQ");
		//Take action on the message
		
		
	}
	
}
