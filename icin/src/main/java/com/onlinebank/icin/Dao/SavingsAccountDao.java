package com.onlinebank.icin.Dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.PrimaryAccount;
import com.onlinebank.icin.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

	SavingsAccount findByAccountNumber(int accounNumber);
}
