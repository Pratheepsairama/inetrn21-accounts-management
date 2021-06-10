package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class Accountimplements implements AccountDao {
	private AccountRepository repo;
	public Accountimplements(AccountRepository therepo) {
		repo=therepo;
	}
	
	
	@Override
	@Transactional
	public List<AccountEntity> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public AccountEntity findById(int account_id) {
		Optional<AccountEntity> finalresult = repo.findById(account_id);
		AccountEntity thecustomer=null;    
		
		if(finalresult.isPresent()) {
			
			thecustomer=finalresult.get();
		}
		
		else {   
		}
		return thecustomer;
	}

	@Override
	@Transactional
	public void save(AccountEntity accountentity) {
		repo.save(accountentity);
	}

	@Override
	@Transactional
	public void deletebyid(int account_id) {
		
		repo.deleteById(account_id);
	}
	

}
