package com.christina.onlinebanking.service;

import com.christina.onlinebanking.model.Transaction;

public interface TransactionService {
    List<Transaction> getAccountTransactions(String accountNumber);
    void createTransaction(String accountNumber, String type, double amount);
}
