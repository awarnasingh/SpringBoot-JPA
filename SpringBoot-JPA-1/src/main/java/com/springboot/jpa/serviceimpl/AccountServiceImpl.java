package com.springboot.jpa.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.domain.Account;
import com.springboot.jpa.repository.AccountRepository;
import com.springboot.jpa.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repository;

	@Override
	public Account save(Account account) {
		return repository.save(account);
	}

	@Override
	public Account update(Account account) {

		return repository.save(account);
	}

	@Override
	public List<Account> findAll() {

		return repository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}
