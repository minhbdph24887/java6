package com.example.demo7.demo7_2.service.impl;

import com.example.demo7.demo7_2.model.Account;
import com.example.demo7.demo7_2.repository.AccountRepository;
import com.example.demo7.demo7_2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
