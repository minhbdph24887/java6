package com.example.demo7.demo7_2.service.impl;

import com.example.demo7.demo7_2.model.Authority;
import com.example.demo7.demo7_2.repository.AuthorityRepository;
import com.example.demo7.demo7_2.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;
    @Override
    public List<Authority> getAllAuthoritys() {
        return authorityRepository.findAll();
    }

    @Override
    public Authority create(Authority authority) {
        Authority newAuthority = Authority.builder()
                .id(authority.getId())
                .account(authority.getAccount())
                .role(authority.getRole())
                .build();
        return authorityRepository.save(newAuthority);
    }

    @Override
    public void delete(Integer id) {
        authorityRepository.deleteById(id);
    }
}
