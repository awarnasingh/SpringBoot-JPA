package com.springboot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
