package com.ocp.activmep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class ControllerProducer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	private String queueName = "VirtualTopic.Test";
	
	@RequestMapping("/{message}")
	public String postMessage(@PathVariable String message) {
		
		jmsTemplate.setPubSubDomain(true);
		jmsTemplate.convertAndSend(queueName, message);
		
		return " Message is posted ";
	}
	
}
