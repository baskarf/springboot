package com.pokernation.service.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oneclicklabs.io
 */
@RestController
@RequestMapping("/webhook")
public class FAQController {

	// Logger instance
	private static final Logger logger = Logger.getLogger(FAQController.class);


	@RequestMapping( method = RequestMethod.POST)
	public @ResponseBody WebhookResponse webhook(@RequestBody String request) {
		
		if (logger.isDebugEnabled()) {
			logger.debug("Start postSomething");
			logger.debug("data: '" + request + "'");
		}

		String response = "Baskar!! ";
		logger.info("data: '" + request + "'");

	
		return new WebhookResponse("Hello! " + response, "Text " + response);
	}

}
