package com.onlinebank.icin.Dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {
	 PrimaryAccount findByAccountNumber (int accountNumber);

}
