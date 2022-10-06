package com.deepu.api.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deepu.api.model.BajajFinance;
import com.deepu.api.service.BajajFinanceService;

/**
 * this call is using for bajaj finance
 */
@RestController
@RequestMapping("/api")
public class BajajController {

	// log4j to print the logs in the console
	private static final Logger logger = LoggerFactory.getLogger(BajajController.class);
	
	@Autowired
	private BajajFinanceService bajajService;

	/**
	 * insert the bajaj finance
	 */
	@PostMapping("/bajaj-finance")
	public String addBajajFinance(@RequestBody BajajFinance bajajFinance) {
		logger.info("Bajaj Finance :: " + bajajFinance);
		String response = "Bajaj data successfully inserted";
		return response;
	}

	/**
	 * get the bajaj finance based on bank Name
	 * @param bankName
	 * @return bajajFinance
	 **/
	@GetMapping("/get-bajaj-finance/{bankName}")
	public String getBajajFinance(@PathVariable String bankName) {

		logger.info("Bank Name = "+bankName);

		String response = "My bank Name :: "+bankName;
		return response;

	}

	@GetMapping("/bajaj-finance")
	public String getBajajDataByZipCode(@RequestParam int zipCode) {

		logger.info("ZipCode :: " + zipCode);
		String response = "ZipCode :: " + zipCode;
		
		return response;

	}
    
	/**
	 * this method is going to update the company details.
	 * @param bajajFinance
	 * @param branchName
	 * @return
	 **/
	@PutMapping("/update-bajaj-finance/{branchName}")
	public String updateBajajFinanceBybranchName(@RequestBody BajajFinance bajajFinance) {
		logger.info("BajajFinance :: " + bajajFinance);
		
		String response = "Bajaj Data successfully updated with branchName =" + bajajFinance.getBranchName();
		return response;

	}
    
	/**
	 * this method is using to delete the bajaj data by product Name
	 * @param productName
	 * @return success response
	 **/
	@DeleteMapping("/delete-bajaj-finance")
	public String deleteBajajFinanceByproductName(@RequestParam String productName) {
		logger.info("ProdsuctName :: " + productName);
		
		String response = "Data successfully deleted By product Name = " + productName;
		return response;

	}

	@PatchMapping("/partial-update-bajaj-finance/{firstName}")
	public String partialupdateByfirstName(@PathVariable String firstName) {
		logger.info("FirstName :: " + firstName);
		
		String response = "Bajaj data is successfully updated with firstName = " + firstName;
		return response;
		
	}
	
	/**
	 * add the bajaj finance using post method
	 * @param bajajFinance
	 * @return string - response
	 **/
	@PostMapping("/add-bajaj-finance")
	public String insertBajajfinance(@RequestBody BajajFinance bajajFinance) {
	logger.info("Bajaj Finance in controller Layer :: "+bajajFinance);	
	
	String response	 = bajajService.insertBajajFinance(bajajFinance);
	return response;
		
	}
	
	
	@GetMapping("/bajaj-finance/{firstName}")
	public BajajFinance getBajajFinanceByFirstName(@PathVariable() String firstName) {
    logger.info("First Name in Controller Layer :: "+firstName);
    BajajFinance response = bajajService.getBajajFinanceByFirstName(firstName);
	return response;
	
	
	}
	 
	
}
