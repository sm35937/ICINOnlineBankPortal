package com.onlinebank.icin.Dao;


import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.PrimaryTransaction;

import java.util.List;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}

