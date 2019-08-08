package com.springboot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.domain.Account;
import com.springboot.jpa.service.AccountService;

@RestController
public class AccountController {

	@Autowired(required = true)
	AccountService accountService;
	

	/**
	 * @param to create account
	 * @return return
	 */
	@PostMapping("/account")
	@ResponseBody
	public ResponseEntity<Account> save(@RequestBody Account account) {

		Account account2 = accountService.save(account);
		return new ResponseEntity<Account>(account2, HttpStatus.CREATED);
	}

	/**
	 * @param to update the account
	 * @return return account with the updated fields
	 */
	@PutMapping("/account")
	public ResponseEntity<Account> update(@RequestBody Account account) {

		Account account2 = accountService.save(account);
		return new ResponseEntity<Account>(account2, HttpStatus.CREATED);
	}

	/**
	 * @return all records from the DB
	 */

	@GetMapping("/account")
	public ResponseEntity findAll() {
		List<Account> accList = accountService.findAll();
		accountService.findAll();
		return new ResponseEntity(accList, HttpStatus.OK);

	}

	/**
	 * @param id it will delete by id.
	 */
	@DeleteMapping("/account/{id}")
	public void deleteById(@PathVariable Long id) {
		accountService.deleteById(id);

	}
}
