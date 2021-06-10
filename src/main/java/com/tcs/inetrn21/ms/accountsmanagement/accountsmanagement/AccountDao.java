package com.tcs.inetrn21.ms.accountsmanagement.accountsmanagement;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public interface AccountDao {
	
	public List<AccountEntity> findAll();
	
	public AccountEntity findById(int account_id);
	
	public void save(AccountEntity accountentity);
	
	public void deletebyid(int account_id);

}
