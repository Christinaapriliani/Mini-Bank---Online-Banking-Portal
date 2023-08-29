package com.christina.onlinebanking.service;

import com.christina.onlinebanking.model.Account;

public interface AccountService {
    Account getAccountInfo(String accountNumber);
    List<Account> getAllAccounts();
    boolean transfer(String sourceAccountNumber, String targetAccountNumber, double amount);
}
