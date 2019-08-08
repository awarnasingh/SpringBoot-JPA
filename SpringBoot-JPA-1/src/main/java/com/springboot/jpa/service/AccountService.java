package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.domain.Account;

public interface AccountService {

	public Account save(Account account);
	
	public Account update(Account account);
	
	public List<Account>findAll();
	
	public void deleteById(Long id);
}
