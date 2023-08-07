package com.example.demo.service.impl;

import com.example.demo.bean.Account;
import com.example.demo.bean.UserDetailCustom;
import com.example.demo.repositoty.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> userName = accountRepository.findById(username);
        System.out.println(userName.get().toString());
        return new UserDetailCustom(userName.get());
    }
}
