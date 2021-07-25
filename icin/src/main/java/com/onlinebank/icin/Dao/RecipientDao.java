package com.onlinebank.icin.Dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.icin.domain.Recipient;

import java.util.List;

public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
