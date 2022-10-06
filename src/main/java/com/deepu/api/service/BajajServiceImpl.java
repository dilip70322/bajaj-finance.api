package com.deepu.api.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepu.api.model.BajajFinance;
import com.deepu.api.repository.BajajRepository;

@Service
public class BajajServiceImpl implements BajajFinanceService {
	
	private static final Logger logger = LoggerFactory.getLogger(BajajServiceImpl.class);
	
	@Autowired
	private BajajRepository bajajRepository;
	
	@Override
	public String insertBajajFinance(BajajFinance bajajFinance) {

	logger.info("Bajaj Finance in Service Layer :: "+ bajajFinance);
	bajajRepository.save(bajajFinance);
	
	return "Bajaj data successfully inserted.";
		
}

	@Override
	public BajajFinance getBajajFinanceByFirstName(String firstName) {
		logger.info("First Name in service Layer :: "+firstName);
		BajajFinance response = bajajRepository.findByFirstName(firstName);
		return response;
	}
	
}