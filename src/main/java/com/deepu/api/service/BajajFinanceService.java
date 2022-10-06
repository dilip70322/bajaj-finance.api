package com.deepu.api.service;

import com.deepu.api.model.BajajFinance;

public interface BajajFinanceService {

	public String insertBajajFinance(BajajFinance bajajFinance);
	public BajajFinance getBajajFinanceByFirstName(String firstName);

}
