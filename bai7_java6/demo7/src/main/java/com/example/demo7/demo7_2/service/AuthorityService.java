package com.example.demo7.demo7_2.service;

import com.example.demo7.demo7_2.model.Authority;

import java.util.List;

public interface AuthorityService {
    List<Authority> getAllAuthoritys();
    Authority create(Authority authority);
    void delete(Integer id);
}
