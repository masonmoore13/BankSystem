package com.lq.bank.service;

import com.lq.bank.enums.AccountType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class AccountService {
	public List<Map<String, Object>> getAllAccounts() {
		List<Map<String, Object>> accountList = new ArrayList<Map<String, Object>>();

		Branch branchA = new Branch("Branch A",1);
		Customer c1 = new Customer("Rodney", "McVay", 24, 10, null, branchA);
		Account ac_1 = new Account(AccountType.CHECKING, "My Account", 150.33, 1, branchA, c1);
		Account ac_2 = new Account(AccountType.SAVINGS, "My Account2", 49000, 2, branchA, c1);

		accountList.add(buildAccountInfo(ac_1));
		accountList.add(buildAccountInfo(ac_2));

		return accountList;
	}

	public Map<String, Object> buildAccountInfo(Account account) {
		Map<String, Object> accountInfo1 = new HashMap<String, Object>();
		accountInfo1.put("accountId", account.getId());
		accountInfo1.put("type", account.getType());
		accountInfo1.put("balance", 1500.40);
		accountInfo1.put("customerId", account.getCustomerId().getId());
		accountInfo1.put("label", account.getLabel());
		accountInfo1.put("branchId", account.getBranch().getBranchId());

		return accountInfo1;

	}

}
