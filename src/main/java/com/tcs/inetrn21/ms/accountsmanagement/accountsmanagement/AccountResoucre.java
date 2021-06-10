package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResoucre {
private AccountDao accountservice;   
	
	@Autowired
	public  void Controller (AccountDao service) {
		accountservice = service;
	}
	@GetMapping("/accounts")
	public List<AccountEntity> findAll() {
		return accountservice.findAll();
	}
		@GetMapping("/accounts/{account_id}")
		public AccountEntity getAccount(@PathVariable int account_id) {
			
			AccountEntity theAccount = accountservice.findById(account_id);
			
			if (theAccount == null) {
				throw new AccountNotFoundExceptionClass("Account id not found - " + account_id);
			}
			
			return theAccount;
		}
		
		
		@PostMapping("/accounts")
		public AccountEntity addAccount(@RequestBody AccountEntity theAccount) {
			theAccount.setAccount_id(0);
			accountservice.save(theAccount);
			return theAccount; // the data is not getting stored in database; 
		}
		@PutMapping("/accounts/{account_id}")
		public AccountEntity updateAccount(@PathVariable int account_id,@RequestBody AccountEntity theAccount) {
			AccountEntity account = accountservice.findById(account_id);
			account.setName(theAccount.getName());
			account.setCurrency(theAccount.getCurrency());
			account.setAvailable_balance(theAccount.getAvailable_balance());
			 accountservice.save(account);
			 return account;
				// the date is not getting updated in the db;
			}
		
		@DeleteMapping("/accounts/{account_id}")
		public String deleteAccount(@PathVariable int account_id) {
			
			AccountEntity tempAccount = accountservice.findById(account_id);
			
			if (tempAccount == null) {
				throw new AccountNotFoundExceptionClass("Employee id not found - " + account_id);
			}
			accountservice.deletebyid(account_id);
			return "Deleted employee id - " + account_id;
			// the date is not getting deleted in the db;
		}

}
