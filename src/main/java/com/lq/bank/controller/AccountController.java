package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@GetMapping
	public List<Map<String, Object>> listAllAccounts() {
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/{id}")
	
	
	public List<Map<String,Object>> getAccountInfo() {
		return null;
	}
	
	@PostMapping
	public String createAccount(Map<String, Object> account) {
		return "Account Added";
	}
	
	@PutMapping
	public String updateAccount() {
		return "update";
	}

	@DeleteMapping("/{id}")
	public String deleteAccount() {
		return "Soon";
	}

	@PutMapping("/{id}/deposit")
	public String deposit() {
		return "Soon";
	}

	@PutMapping("/{id}/withdrawal")
	public String withdrawal() {
		return "Soon";
	}
}
