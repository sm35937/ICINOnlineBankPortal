package com.onlinebank.icin.service;

import java.security.Principal;

import com.onlinebank.icin.domain.PrimaryAccount;
import com.onlinebank.icin.domain.SavingsAccount;

public interface AccountService {
PrimaryAccount createPrimaryAccount();
SavingsAccount createSavingsAccount();
void deposit(String accountType, double amount, Principal principal);
void withdraw(String accountType, double amount, Principal principal);
}
