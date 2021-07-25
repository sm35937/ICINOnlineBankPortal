package com.onlinebank.icin.Dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.SavingsTransaction;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
